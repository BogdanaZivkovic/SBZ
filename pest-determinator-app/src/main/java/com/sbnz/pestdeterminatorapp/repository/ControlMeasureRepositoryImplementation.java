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
		ControlMeasure controlMeasure6 = new ControlMeasure("Acetamiprid (4A)", ControlMeasureType.Chemical); 
		ControlMeasure controlMeasure7 = new ControlMeasure("Cyfluthrin (3A)", ControlMeasureType.Chemical);
		ControlMeasure controlMeasure8 = new ControlMeasure("Permethrin (3A)", ControlMeasureType.Chemical);
		ControlMeasure controlMeasure9 = new ControlMeasure("Carbaryl (1A)", ControlMeasureType.Chemical);
		ControlMeasure controlMeasure10 = new ControlMeasure("Malathion (1B)", ControlMeasureType.Chemical);
		ControlMeasure controlMeasure11 = new ControlMeasure("Predators", ControlMeasureType.Biological);
		ControlMeasure controlMeasure12 = new ControlMeasure("Parasites", ControlMeasureType.Biological);
		ControlMeasure controlMeasure13 = new ControlMeasure("Diseases", ControlMeasureType.Biological);	
		ControlMeasure controlMeasure14 = new ControlMeasure("Shaking plants", ControlMeasureType.Mechanical);
		ControlMeasure controlMeasure15 = new ControlMeasure("Fly swatters", ControlMeasureType.Mechanical);
		ControlMeasure controlMeasure16 = new ControlMeasure("Mouse traps", ControlMeasureType.Mechanical);
		ControlMeasure controlMeasure17 = new ControlMeasure("Tillage", ControlMeasureType.Mechanical);
		ControlMeasure controlMeasure18 = new ControlMeasure("Window screens", ControlMeasureType.Physical);
		ControlMeasure controlMeasure19 = new ControlMeasure("Floating row covers", ControlMeasureType.Physical);
		ControlMeasure controlMeasure20 = new ControlMeasure("Plant collars", ControlMeasureType.Physical);
		ControlMeasure controlMeasure21 = new ControlMeasure("Glueboard traps", ControlMeasureType.Physical);
		ControlMeasure controlMeasure22 = new ControlMeasure("Red sphere traps", ControlMeasureType.Physical);
		
		controlMeasures.add(controlMeasure1);
		controlMeasures.add(controlMeasure2);
		controlMeasures.add(controlMeasure3);
		controlMeasures.add(controlMeasure4);
		controlMeasures.add(controlMeasure5);
		controlMeasures.add(controlMeasure6);
		controlMeasures.add(controlMeasure7);
		controlMeasures.add(controlMeasure8);
		controlMeasures.add(controlMeasure9);
		controlMeasures.add(controlMeasure10);
		controlMeasures.add(controlMeasure11);
		controlMeasures.add(controlMeasure12);
		controlMeasures.add(controlMeasure13);
		controlMeasures.add(controlMeasure14);
		controlMeasures.add(controlMeasure15);
		controlMeasures.add(controlMeasure16);
		controlMeasures.add(controlMeasure17);
		controlMeasures.add(controlMeasure18);
		controlMeasures.add(controlMeasure19);
		controlMeasures.add(controlMeasure20);
		controlMeasures.add(controlMeasure21);
		controlMeasures.add(controlMeasure22);
		
	}
	
	public List<ControlMeasure> findAll(){
		return controlMeasures;
	}
}
