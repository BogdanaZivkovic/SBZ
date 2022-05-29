package com.sbnz.pestdeterminatorapp.dto;

import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;

public class ControlMeasureInputDTO {
	private ControlMeasureType controlMeasureType;
	private String pest;
	
	public ControlMeasureType getControlMeasureType() {
		return controlMeasureType;
	}
	public void setControlMeasureType(ControlMeasureType controlMeasureType) {
		this.controlMeasureType = controlMeasureType;
	}
	public String getPest() {
		return pest;
	}
	public void setPest(String pest) {
		this.pest = pest;
	}
}
