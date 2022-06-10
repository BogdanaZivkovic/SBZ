package com.sbnz.pestdeterminatorapp.service.serviceInterface;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.Plant;

public interface PlantService {
	
	Plant findById(long id);
	
	Plant findByUser(long user);

    List<Plant> findAll();

    Plant save(Plant plant);

    void deleteById(long id);
    
    Plant update(Plant plant);

}
