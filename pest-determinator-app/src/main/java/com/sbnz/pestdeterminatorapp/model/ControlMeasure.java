package com.sbnz.pestdeterminatorapp.model;

public class ControlMeasure {
	
	private String name;
	private ControlMeasureType type;
	
	public ControlMeasure(String name, ControlMeasureType type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ControlMeasureType getType() {
		return type;
	}
	public void setType(ControlMeasureType type) {
		this.type = type;
	}
}
