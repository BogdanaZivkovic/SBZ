package com.sbnz.pestdeterminatorapp.dto;

import com.sbnz.pestdeterminatorapp.model.Symptom;

public class SymptomDTO {
	private Symptom symptom;
	private String name;
	
	public SymptomDTO() {} 
	
	public SymptomDTO(Symptom symptom) {
		this.symptom = symptom;
		this.name = symptom.toString();
	}

	public SymptomDTO(Symptom symptom, String name) {
		super();
		this.symptom = symptom;
		this.name = name;
	}
	
	public Symptom getSymptom() {
		return symptom;
	}
	public void setSymptom(Symptom symptom) {
		this.symptom = symptom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
