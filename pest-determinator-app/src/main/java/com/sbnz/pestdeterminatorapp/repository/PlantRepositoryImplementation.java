package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;

@Repository
public class PlantRepositoryImplementation implements PlantRepository {

	private List<Plant> plants = new ArrayList<Plant>();	
	
	public PlantRepositoryImplementation() {
		
		Plant p1 = new Plant(1L, "student", null, new ArrayList<>(), null, null, new ArrayList<>(), PlantSpecies.Cucumber);
		Plant p2 = new Plant(2L, "student", null, new ArrayList<>(), null, null, new ArrayList<>(), PlantSpecies.Tomato);
		Plant p3 = new Plant(3L, "student", null, new ArrayList<>(), null, null, new ArrayList<>(), PlantSpecies.Potato);
		Plant p4 = new Plant(4L, "student", null, new ArrayList<>(), null, null, new ArrayList<>(), PlantSpecies.Tomato);
		
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
