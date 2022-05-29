package com.sbnz.pestdeterminatorapp.controller;

import java.util.Collection;

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
import com.sbnz.pestdeterminatorapp.dto.ControlMeasureInputDTO;
import com.sbnz.pestdeterminatorapp.dto.DeterminationInputDTO;
import com.sbnz.pestdeterminatorapp.model.Symptom;

@RestController
@RequestMapping("determination")
public class PestDeterminatorController {
	
	private static Logger log = LoggerFactory.getLogger(PestDeterminatorController.class);
	
	@Autowired
	private PestDeterminatorService pestDeterminatorService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public void getPest(@RequestBody DeterminationInputDTO dto) {

		pestDeterminatorService.determinePest(dto);

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/control", method = RequestMethod.GET, produces = "application/json")
	public void getDiagnosis(@RequestBody ControlMeasureInputDTO dto) {

		pestDeterminatorService.getDiagnosis(dto);

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/symptoms", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Symptom>> getSymptoms() {

		return new ResponseEntity<>(pestDeterminatorService.getSymptoms(), HttpStatus.OK);
	}
}
