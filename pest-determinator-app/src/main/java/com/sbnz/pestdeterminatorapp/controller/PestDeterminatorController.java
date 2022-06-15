package com.sbnz.pestdeterminatorapp.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbnz.pestdeterminatorapp.service.PestDeterminatorService;
import com.sbnz.pestdeterminatorapp.dto.DeterminationInputDTO;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.Symptom;

@RestController
@RequestMapping("determination")
public class PestDeterminatorController {
	
	private static Logger log = LoggerFactory.getLogger(PestDeterminatorController.class);
	
	@Autowired
	private PestDeterminatorService pestDeterminatorService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Plant> getPest(@RequestBody DeterminationInputDTO dto) {

		Plant plant = pestDeterminatorService.determinePest(dto);
		
		return new ResponseEntity<>(plant, HttpStatus.OK);

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/symptoms", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Symptom>> getSymptoms() {

		return new ResponseEntity<>(pestDeterminatorService.getSymptoms(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/report", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Plant>> getReport() {
		
		List<Plant> plants = pestDeterminatorService.getReport();
		
		return new ResponseEntity<>(plants, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/unusedControlMeasure", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Plant>> getUnusedControlMeasure() {
		
		List<Plant> plants = pestDeterminatorService.getUnusedControlMeasure();
		
		return new ResponseEntity<>(plants, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/pestSuspect", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Pest>> pestSuspect() {
		
		List<Pest> pests = pestDeterminatorService.pestSuspect();
		
		return new ResponseEntity<>(pests,HttpStatus.OK);
	}
}
