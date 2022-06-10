package com.sbnz.pestdeterminatorapp.repository;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.Plant;

public interface PlantRepository {
	
	public Plant findById(long id);

	public List<Plant> findAll();
	
	public Plant update(Plant plant);
}
