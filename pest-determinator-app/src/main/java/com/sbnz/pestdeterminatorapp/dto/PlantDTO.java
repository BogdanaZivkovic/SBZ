package com.sbnz.pestdeterminatorapp.dto;

import java.util.ArrayList;
import java.util.List;

import com.sbnz.pestdeterminatorapp.model.Diagnosis;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;
import com.sbnz.pestdeterminatorapp.model.Symptom;

public class PlantDTO {
	
	private Long id;
	private String user;
	private Pest currentPest;
	private List<Diagnosis> pestHistory;
	private List<SymptomDTO> symptoms;
	private List<PlantPart> affectedParts;
	private PlantSpecies plantSpecies;
	
	public PlantDTO() {} 
	
	public PlantDTO(Plant plant) {
		this.id = plant.getId();
		this.user = plant.getUser();
		this.currentPest = plant.getCurrentPest();
		this.pestHistory = plant.getPestHistory();
		this.symptoms = new ArrayList<>();
		List<Symptom> symptomList = plant.getSymptoms();
		if(symptomList!=null) {
			for(Symptom symptom: symptomList) {
				SymptomDTO symptomDTO = new SymptomDTO(symptom);
				this.symptoms.add(symptomDTO);
			}
		}
		this.affectedParts = plant.getAffectedParts();
		this.plantSpecies = plant.getPlantSpecies();
	}

	public PlantDTO(Long id, String user, Pest currentPest, List<Diagnosis> pestHistory, List<SymptomDTO> symptoms,
			List<PlantPart> affectedParts, PlantSpecies plantSpecies) {
		super();
		this.id = id;
		this.user = user;
		this.currentPest = currentPest;
		this.pestHistory = pestHistory;
		this.symptoms = symptoms;
		this.affectedParts = affectedParts;
		this.plantSpecies = plantSpecies;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Pest getCurrentPest() {
		return currentPest;
	}

	public void setCurrentPest(Pest currentPest) {
		this.currentPest = currentPest;
	}

	public List<Diagnosis> getPestHistory() {
		return pestHistory;
	}

	public void setPestHistory(List<Diagnosis> pestHistory) {
		this.pestHistory = pestHistory;
	}

	public List<PlantPart> getAffectedParts() {
		return affectedParts;
	}

	public void setAffectedParts(List<PlantPart> affectedParts) {
		this.affectedParts = affectedParts;
	}

	public PlantSpecies getPlantSpecies() {
		return plantSpecies;
	}

	public void setPlantSpecies(PlantSpecies plantSpecies) {
		this.plantSpecies = plantSpecies;
	}

	public List<SymptomDTO> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<SymptomDTO> symptoms) {
		this.symptoms = symptoms;
	}
}
