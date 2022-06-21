package com.sbnz.pestdeterminatorapp.dto;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.Plant;

public class DeterminedPestDTO {
	private Plant plant;
	private List<ControlMeasure> controlMeasures;
	
	public Plant getPlant() {
		return plant;
	}
	public void setPlant(Plant plant) {
		this.plant = plant;
	}
	public List<ControlMeasure> getControlMeasures() {
		return controlMeasures;
	}
	public void setControlMeasures(List<ControlMeasure> controlMeasures) {
		this.controlMeasures = controlMeasures;
	}
	
	public DeterminedPestDTO() {} 
	
	public DeterminedPestDTO(Plant plant, List<ControlMeasure> controlMeasures ) {
		this.plant = plant;
		this.controlMeasures = controlMeasures;
	}
}
