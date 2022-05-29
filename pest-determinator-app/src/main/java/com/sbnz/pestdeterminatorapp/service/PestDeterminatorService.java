package com.sbnz.pestdeterminatorapp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbnz.pestdeterminatorapp.dto.ControlMeasureInputDTO;
import com.sbnz.pestdeterminatorapp.dto.DeterminationInputDTO;
import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.Symptom;
import com.sbnz.pestdeterminatorapp.repository.ControlMeasureRepositoryImplementation;
import com.sbnz.pestdeterminatorapp.repository.PestRepositoryImplementation;

@Service
public class PestDeterminatorService {
	
	@Autowired
	private KieContainer kieContainer;
	
	private final PestRepositoryImplementation pestRepository = new PestRepositoryImplementation();
	private final ControlMeasureRepositoryImplementation controlMeasureRepository = new ControlMeasureRepositoryImplementation();
	
	public void determinePest(DeterminationInputDTO dto) {
		KieSession kieSession = kieContainer.newKieSession();
		
		List<Pest> pests = pestRepository.findAll();
		
		for(Pest pest : pests) {
			kieSession.insert(pest);
		}
		
		Plant plant = new Plant();
		plant.setId(1L);
		plant.setAffectedParts(dto.getAffectedParts());
		plant.setCurrentPest(null);
		plant.setPlantSpecies(dto.getPlantSpecies());
		plant.setSymptoms(dto.getSymptoms());
		plant.setUser("Boba");
		
		kieSession.insert(plant);
		
		kieSession.fireAllRules();
	}
	
	public void getDiagnosis(ControlMeasureInputDTO dto) {
		KieSession kieSession = kieContainer.newKieSession();
		
		List<ControlMeasure> controlMeasures = controlMeasureRepository.findAll();
		
		for(ControlMeasure controlMeasure : controlMeasures) {
			kieSession.insert(controlMeasure);
		}
		
		Pest pest = pestRepository.findByName(dto.getPest());
		kieSession.insert(pest);
		
		ControlMeasureType type = dto.getControlMeasureType();	
		kieSession.insert(type);
		
		kieSession.fireAllRules();
		
	}
	
	public Collection<Symptom> getSymptoms() {
		List<Symptom> symptomsList = new ArrayList<Symptom>(EnumSet.allOf(Symptom.class));
		return symptomsList;
	}
}
