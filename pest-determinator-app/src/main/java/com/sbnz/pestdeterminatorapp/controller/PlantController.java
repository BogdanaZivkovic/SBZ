package com.sbnz.pestdeterminatorapp.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbnz.pestdeterminatorapp.dto.PlantDTO;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.PlantService;

@RestController
@RequestMapping("plants")
public class PlantController {
	
	@Autowired
	private PlantService plantService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<PlantDTO>> findAll() {
        Collection<Plant> plants = plantService.findAll();
        Collection<PlantDTO> plantDTOS = new ArrayList<>();
        for (Plant plant : plants) {
        	plantDTOS.add(new PlantDTO(plant));
        }

        return new ResponseEntity<>(plantDTOS, HttpStatus.OK);
    }
}
