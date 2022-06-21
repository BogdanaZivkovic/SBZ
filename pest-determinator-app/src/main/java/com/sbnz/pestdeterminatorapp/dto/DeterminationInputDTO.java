package com.sbnz.pestdeterminatorapp.dto;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;
import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;

public class DeterminationInputDTO {
	private List<SymptomDTO> symptoms;
	private List<PlantPart> affectedParts;
	private PlantSpecies plantSpecies;
	private ControlMeasureType controlMeasureType;
	
	
	public List<SymptomDTO> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<SymptomDTO> symptoms) {
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
	public ControlMeasureType getControlMeasureType() {
		return controlMeasureType;
	}
	public void setControlMeasureType(ControlMeasureType controlMeasureType) {
		this.controlMeasureType = controlMeasureType;
	}
}
