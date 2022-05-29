package com.sbnz.pestdeterminatorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.repository.PlantRepository;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.PlantService;

@Service
public class PlantServiceImplementation implements PlantService {
	
	@Autowired 
	PlantRepository plantRepository;

	@Override
	public Plant findById(long id) {
		return plantRepository.findById(id);
	}

	@Override
	public Plant findByUser(long user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plant> findAll() {
		return plantRepository.findAll();
	}

	@Override
	public Plant save(Plant plant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
