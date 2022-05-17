package com.sbnz.pestdeterminatorapp.model;

import java.time.LocalDateTime;

public class Diagnosis {
	
	private LocalDateTime date;
	private Pest pest;
	private ControlMeasure controlMeasure;
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Pest getPest() {
		return pest;
	}
	public void setPest(Pest pest) {
		this.pest = pest;
	}
	public ControlMeasure getControlMeasure() {
		return controlMeasure;
	}
	public void setControlMeasure(ControlMeasure controlMeasure) {
		this.controlMeasure = controlMeasure;
	}	
}
