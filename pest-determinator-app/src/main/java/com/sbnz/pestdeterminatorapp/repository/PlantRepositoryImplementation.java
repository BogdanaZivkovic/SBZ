package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
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
		
		List<Symptom> symptoms1 = new ArrayList<>();
		symptoms1.add(Symptom.WHITE_SPOTS);
		symptoms1.add(Symptom.INDOORS);
		symptoms1.add(Symptom.WHITE_MINES);
		
		List<Symptom> symptoms2 = new ArrayList<>();
		symptoms2.add(Symptom.WHITE_SPOTS);
		symptoms2.add(Symptom.DRIED_LEAVES);
		symptoms2.add(Symptom.TOMATO_MOSAIC_VIRUS);
		
		List<Symptom> symptoms3 = new ArrayList<>();
		symptoms3.add(Symptom.EATEN_LEAVES);
		
		List<PlantPart> plantParts = new ArrayList<>();
		plantParts.add(PlantPart.Leaf);
		
		Plant p1 = new Plant(1L, "student", null, new ArrayList<>(), symptoms1, plantParts, PlantSpecies.Cucumber);
		Plant p2 = new Plant(2L, "student", null, new ArrayList<>(), symptoms2, plantParts, PlantSpecies.Tomato);
		Plant p3 = new Plant(3L, "student", null, new ArrayList<>(), symptoms3, plantParts, PlantSpecies.Potato);
		Plant p4 = new Plant(4L, "student", null, new ArrayList<>(), null, plantParts, PlantSpecies.Tomato);
		
		plants.add(p1);
		plants.add(p2);
		plants.add(p3);
		plants.add(p4);
		
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

	@Override
	public Plant update(Plant plant) {
		for (Plant p : plants) {
			if(p.getId().equals(plant.getId())) {
				p = plant;
				return p;
			}
		}
		return null;
	}
}
