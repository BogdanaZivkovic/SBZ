package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;

@Repository
public class ControlMeasureRepositoryImplementation implements ControlMeasureRepository {
	
	private List<ControlMeasure> controlMeasures = new ArrayList<ControlMeasure>();	

	public ControlMeasureRepositoryImplementation() {
		ControlMeasure controlMeasure1 = new ControlMeasure("Crop rotation", ControlMeasureType.Cultural);
		ControlMeasure controlMeasure2 = new ControlMeasure("Sanitation", ControlMeasureType.Cultural);
		ControlMeasure controlMeasure3 = new ControlMeasure("Trap cropping", ControlMeasureType.Cultural);
		ControlMeasure controlMeasure4 = new ControlMeasure("Planned time of planting", ControlMeasureType.Cultural);
		ControlMeasure controlMeasure5 = new ControlMeasure("Hand-picking", ControlMeasureType.Mechanical);
		
		controlMeasures.add(controlMeasure1);
		controlMeasures.add(controlMeasure2);
		controlMeasures.add(controlMeasure3);
		controlMeasures.add(controlMeasure4);
		controlMeasures.add(controlMeasure5);
	}
	
	public List<ControlMeasure> findAll(){
		return controlMeasures;
	}
}
