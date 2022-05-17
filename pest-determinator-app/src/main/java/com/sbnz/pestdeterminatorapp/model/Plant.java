package com.sbnz.pestdeterminatorapp.model;

import java.util.List;

public class Plant {

	private Long id;
	private String user;
	private Pest currentPest;
	private List<Diagnosis> pestHistory;
	private List<Symptom> symptoms;
	private List<PlantPart> affectedParts;
	private PlantSpecies plantSpecies;
			
	public Plant() {}
		
	public Plant(Long id, String user, Pest currentPest, List<Diagnosis> pestHistory, List<Symptom> symptoms,
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
	public List<Diagnosis> getPestHistory() {
		return pestHistory;
	}
	public void setPestHistory(List<Diagnosis> pestHistory) {
		this.pestHistory = pestHistory;
	}
	public PlantSpecies getPlantSpecies() {
		return plantSpecies;
	}
	public void setPlantSpecies(PlantSpecies plantSpecies) {
		this.plantSpecies = plantSpecies;
	}
	public List<Symptom> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}
	public Pest getCurrentPest() {
		return currentPest;
	}
	public void setCurrentPest(Pest currentPest) {
		this.currentPest = currentPest;
	}
	public List<PlantPart> getAffectedParts() {
		return affectedParts;
	}
	public void setAffectedParts(List<PlantPart> affectedParts) {
		this.affectedParts = affectedParts;
	}	
}
