package com.sbnz.pestdeterminatorapp.model;

import java.util.ArrayList;
import java.util.List;

public class Pest {
	
	private String name;
	private List<Symptom> symptoms;
	private List<PlantSpecies> plantSpecies;
	private List<PlantPart> plantParts;
		
	public Pest(String name) {
		super();
		this.name = name;
		this.symptoms = new ArrayList<Symptom>();
		this.plantSpecies = new ArrayList<PlantSpecies>();
		this.plantParts = new ArrayList<PlantPart>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Symptom> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

	public List<PlantSpecies> getPlantSpecies() {
		return plantSpecies;
	}

	public void setPlantSpecies(List<PlantSpecies> plantSpecies) {
		this.plantSpecies = plantSpecies;
	}

	public List<PlantPart> getPlantParts() {
		return plantParts;
	}

	public void setPlantParts(List<PlantPart> plantParts) {
		this.plantParts = plantParts;
	}	

}
