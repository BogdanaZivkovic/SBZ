package com.sbnz.pestdeterminatorapp.dto;

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
	private List<Symptom> symptoms;
	private List<PlantPart> affectedParts;
	private PlantSpecies plantSpecies;
	
	public PlantDTO() {} 
	
	public PlantDTO(Plant plant) {
		this.id = plant.getId();
		this.user = plant.getUser();
		this.currentPest = plant.getCurrentPest();
		this.pestHistory = plant.getPestHistory();
		this.symptoms = plant.getSymptoms();
		this.affectedParts = plant.getAffectedParts();
		this.plantSpecies = plant.getPlantSpecies();
	}

	public PlantDTO(Long id, String user, Pest currentPest, List<Diagnosis> pestHistory, List<Symptom> symptoms,
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

	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
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
}
