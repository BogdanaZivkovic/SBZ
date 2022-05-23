package com.sbnz.pestdeterminatorapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbnz.pestdeterminatorapp.service.PestDeterminatorService;
import com.sbnz.pestdeterminatorapp.dto.ControlMeasureInputDTO;
import com.sbnz.pestdeterminatorapp.dto.DeterminationInputDTO;

@RestController
@RequestMapping("determination")
public class PestDeterminatorController {
	
	private static Logger log = LoggerFactory.getLogger(PestDeterminatorController.class);
	
	@Autowired
	private PestDeterminatorService pestDeterminatorService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public void getPest(@RequestBody DeterminationInputDTO dto) {

		pestDeterminatorService.determinePest(dto);

	}
	
	@RequestMapping(value = "/control", method = RequestMethod.GET, produces = "application/json")
	public void getDiagnosis(@RequestBody ControlMeasureInputDTO dto) {

		pestDeterminatorService.getDiagnosis(dto);

	}
}
