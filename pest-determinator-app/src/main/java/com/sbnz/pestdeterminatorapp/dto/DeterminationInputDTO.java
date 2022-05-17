package com.sbnz.pestdeterminatorapp.dto;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;
import com.sbnz.pestdeterminatorapp.model.Symptom;

public class DeterminationInputDTO {
	private List<Symptom> symptoms;
	private List<PlantPart> affectedParts;
	private PlantSpecies plantSpecies;
	
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
