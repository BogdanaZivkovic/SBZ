package com.sbnz.pestdeterminatorapp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbnz.pestdeterminatorapp.dto.DeterminationInputDTO;
import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.Symptom;
import com.sbnz.pestdeterminatorapp.repository.PestRepository;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.PlantService;

@Service
public class PestDeterminatorService {
	
	@Autowired
	private KieContainer kieContainer;
	
	@Autowired
	private PestRepository pestRepository;
	
	@Autowired
	private PlantService plantService;
	
	public Plant determinePest(DeterminationInputDTO dto) {
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}
		
		Plant plant = plantService.findById(4L);
		plant.setCurrentPest(null);
		plant.setAffectedParts(dto.getAffectedParts());
		plant.setPlantSpecies(dto.getPlantSpecies());
		plant.setSymptoms(dto.getSymptoms());	
		kieSession.insert(plant);
		
		ControlMeasureType type = dto.getControlMeasureType();	
		kieSession.insert(type);
		
		List<ControlMeasure> collectedControlMeasures = new ArrayList<>();
		kieSession.insert(collectedControlMeasures);
		
		kieSession.getAgenda().getAgendaGroup("pest determination").setFocus();
		
		kieSession.fireAllRules();
		
		plantService.update(plant);
		
		return plant;
	}
	
	public List<Plant> getReport() {
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Plant> plants = plantService.findAll();
		
		for(Plant plant : plants) {
			kieSession.insert(plant);
		}
		
		List<Plant> collectedPlants = new ArrayList<>();
		kieSession.insert(collectedPlants);
		
		kieSession.getAgenda().getAgendaGroup("report").setFocus();
		
		kieSession.fireAllRules();
		
		return collectedPlants;
	}
	
	public List<Plant> getUnusedControlMeasure() {
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Plant> plants = plantService.findAll();
		
		for(Plant plant : plants) {
			kieSession.insert(plant);
		}
		
		List<Plant> collectedPlants = new ArrayList<>();
		kieSession.insert(collectedPlants);
		
		//kieSession.getAgenda().getAgendaGroup("report change control measure").setFocus();
		
		kieSession.fireAllRules();
		
		return collectedPlants;
	}
	
	public List<Pest> pestSuspect() {
		KieSession kieSession = kieContainer.newKieSession();
		
		Plant plant = plantService.findById(4L);

		kieSession.insert(plant);
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}
		
		List<Pest> pestSuspects = new ArrayList<>();
		kieSession.insert(pestSuspects);
		
		kieSession.getAgenda().getAgendaGroup("test").setFocus();
		
		kieSession.fireAllRules();
		
		return pestSuspects;
	}
	
	public Collection<Symptom> getSymptoms() {
		List<Symptom> symptomsList = new ArrayList<Symptom>(EnumSet.allOf(Symptom.class));
		return symptomsList;
	}
}
