package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;
import com.sbnz.pestdeterminatorapp.model.Symptom;

@Repository
public class PlantRepositoryImplementation implements PlantRepository {
	
	private List<Plant> plants = new ArrayList<Plant>();	
	
	public PlantRepositoryImplementation() {
		
		List<Symptom> symptoms1 = new LinkedList<>();
		symptoms1.add(Symptom.WHITE_SPOTS);
		symptoms1.add(Symptom.INDOORS);
		symptoms1.add(Symptom.WHITE_MINES);
		
		List<Symptom> symptoms2 = new LinkedList<>();
		symptoms2.add(Symptom.WHITE_SPOTS);
		symptoms2.add(Symptom.DRIED_LEAVES);
		symptoms2.add(Symptom.TOMATO_MOSAIC_VIRUS);
		
		List<Symptom> symptoms3 = new LinkedList<>();
		symptoms3.add(Symptom.OVAL_YELLOW_BODY_WITH_BLACK_STRIPES);
		symptoms3.add(Symptom.ORANGE_EGGS);
		symptoms3.add(Symptom.REDDISH_LARVA_WITH_BLACK_HEAD);
		
		List<PlantPart> plantParts = new LinkedList<>();
		plantParts.add(PlantPart.Leaf);
		
		Plant p1 = new Plant(1L, "student", null, null, symptoms1, plantParts, PlantSpecies.Cucumber);
		Plant p2 = new Plant(2L, "student", null, null, symptoms2, plantParts, PlantSpecies.Tomato);
		Plant p3 = new Plant(3L, "student", null, null, symptoms3, plantParts, PlantSpecies.Potato);
		
		plants.add(p1);
		plants.add(p2);
		plants.add(p3);
		
	}

	@Override
	public List<Plant> findAll() {
		return plants;		
	}
	
	@Override
	public Plant findById(long id) {
		for (Plant plant : plants) {
			if(plant.getId().equals(id)) {
				return plant;
			}
		}
		return null;
	}
}
