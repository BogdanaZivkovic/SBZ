package com.sbnz.pestdeterminatorapp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;
import com.sbnz.pestdeterminatorapp.model.Diagnosis;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;
import com.sbnz.pestdeterminatorapp.model.Symptom;
import com.sbnz.pestdeterminatorapp.repository.PestRepository;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.PlantService;

@SpringBootTest
class PestDeterminatorAppApplicationTests {
	
	@Autowired
	private KieContainer kieContainer;

	@Autowired
	private PlantService plantService;
	
	@Autowired
	private PestRepository pestRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void pestDetermination() {
				
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}

		Plant plant = getPlant();
		kieSession.insert(plant);
		
		ControlMeasureType type = ControlMeasureType.Biological;	
		kieSession.insert(type);
		
		List<ControlMeasure> collectedControlMeasures = new ArrayList<>();
		kieSession.insert(collectedControlMeasures);
		
		kieSession.getAgenda().getAgendaGroup("pest determination").setFocus();
		int fired = kieSession.fireAllRules();
		
		plantService.update(plant);
		
		kieSession.dispose();
		
		assertEquals(fired, 2);
		assertEquals(plant.getCurrentDiagnosis().getControlMeasure().getType(), ControlMeasureType.Biological);
		assertEquals(plant.getCurrentDiagnosis().getControlMeasure().getName(), "Parasites");
		assertEquals(plant.getCurrentDiagnosis().getPest().getName(), "Tuta absoluta");
		assertEquals(plant.getCurrentPest().getName(), "Tuta absoluta");
	}
	
	@Test
	public void forwardChainingTest() {
				
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}

		Plant plant = getPlant();
		plant.setPestHistory(getPestHistory());
		kieSession.insert(plant);
		
		ControlMeasureType type = ControlMeasureType.Mechanical;	
		kieSession.insert(type);
		
		List<ControlMeasure> collectedControlMeasures = new ArrayList<>();
		kieSession.insert(collectedControlMeasures);
		
		kieSession.getAgenda().getAgendaGroup("pest determination").setFocus();
		int fired = kieSession.fireAllRules();
		
		plantService.update(plant);
		
		kieSession.dispose();
		
		assertEquals(fired, 4);
		assertEquals(collectedControlMeasures.get(0).getName(), "Floating row covers");
		assertEquals(collectedControlMeasures.size(), 1);
		assertEquals(plant.isReportSuggested(), true);
		assertEquals(plant.getCurrentPest().getName(), "Tuta absoluta");
	}
	
	@Test
	public void reportTest() {
		
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Plant> plants = getPlants();
		Plant plant = getPlant();	
		plant.setPestHistory(getPestHistory());
		plant.addDiagnosis(getDiagnosis());
		plants.add(plant);
		
		for(Plant p : plants) {
			kieSession.insert(p);
		}

		List<Plant> collectedPlants = new ArrayList<>();
		kieSession.insert(collectedPlants);
		
		kieSession.getAgenda().getAgendaGroup("report").setFocus();

		int fired = kieSession.fireAllRules();
		
		kieSession.dispose();
		
		assertEquals(fired, 1);
		assertEquals(collectedPlants.get(0).getPlantSpecies(), PlantSpecies.Tomato);
		assertEquals(collectedPlants.size(), 1);
	}
	
	@Test
	public void backwardChaining() {
		
		KieSession kieSession = kieContainer.newKieSession();
		
		Plant plant = getPlant();
		plant.setPestHistory(getPestHistory());
		plant.addDiagnosis(getDiagnosis());
		plant.setCurrentPest(getPest());

		kieSession.insert(plant);
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}
		
		List<Pest> pestSuspects = new ArrayList<>();
		kieSession.insert(pestSuspects);
		
		kieSession.getAgenda().getAgendaGroup("test").setFocus();

		int fired = kieSession.fireAllRules();
		
		kieSession.dispose();
		
		assertEquals(fired, 2);
		assertEquals(pestSuspects.size(), 2);		
		assertTrue(pestSuspects.get(1).getName().equals("Liriomyza trifolii") || pestSuspects.get(1).getName().equals("Thrips tabaci"));
		assertTrue(pestSuspects.get(0).getName().equals("Liriomyza trifolii") || pestSuspects.get(0).getName().equals("Thrips tabaci"));
	}
	
	private Plant getPlant() {
		
		List<PlantPart> plantParts = new ArrayList<>();
		plantParts.add(PlantPart.Leaf);
		plantParts.add(PlantPart.Fruit);
		plantParts.add(PlantPart.Stem);
		
		List<Symptom> symptoms = new ArrayList<>();
		symptoms.add(Symptom.WHITE_MINES);
		symptoms.add(Symptom.WHITE_SPOTS);
		symptoms.add(Symptom.SHALLOW_WELLS);
		
		Plant plant = new Plant(4L, "student", null, new ArrayList<>(), null, symptoms, plantParts, PlantSpecies.Tomato);

		return plant;
	}
	
	private List<Diagnosis> getPestHistory() {
		Pest pest = pestRepository.findByName("Tuta absoluta");
		
		Diagnosis diagnosis1 = new Diagnosis();	
		diagnosis1.setControlMeasure(new ControlMeasure("Parasites", ControlMeasureType.Biological));
		diagnosis1.setPest(pest);
		diagnosis1.setDate(LocalDateTime.now().minusDays(3));
		
		Diagnosis diagnosis2 = new Diagnosis();
		diagnosis2.setControlMeasure(new ControlMeasure("Acetamiprid (4A)", ControlMeasureType.Chemical));
		diagnosis2.setPest(pest);
		diagnosis2.setDate(LocalDateTime.now().minusDays(10));
		
		Diagnosis diagnosis3 = new Diagnosis();
		diagnosis3.setControlMeasure(new ControlMeasure("Planned time of planting", ControlMeasureType.Cultural));
		diagnosis3.setPest(pest);
		diagnosis3.setDate(LocalDateTime.now().minusDays(5));
		
		List<Diagnosis> diagnosisList = new ArrayList<>();
		diagnosisList.add(diagnosis1);
		diagnosisList.add(diagnosis2);
		diagnosisList.add(diagnosis3);
		
		return diagnosisList;
	}
	
	private List<Plant> getPlants() {
		Plant p1 = new Plant(1L, "student", null, new ArrayList<>(), null, null, null, PlantSpecies.Cucumber);
		Plant p2 = new Plant(2L, "student", null, new ArrayList<>(), null, null, null, PlantSpecies.Tomato);
		Plant p3 = new Plant(3L, "student", null, new ArrayList<>(), null, null, null, PlantSpecies.Potato);
		List<Plant> plants = new ArrayList<>();
		
		plants.add(p1);
		plants.add(p2);
		plants.add(p3);
		
		return plants;
	}
	
	private Diagnosis getDiagnosis() {
		Pest pest = pestRepository.findByName("Tuta absoluta");
		Diagnosis diagnosis = new Diagnosis();
		diagnosis.setControlMeasure(new ControlMeasure("Floating row covers", ControlMeasureType.Physical));
		diagnosis.setPest(pest);
		diagnosis.setDate(LocalDateTime.now().minusDays(7));
		return diagnosis;
	}
	
	private Pest getPest() {
		Pest pest = pestRepository.findByName("Tuta absoluta");
		return pest;
	}
}
