package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbnz.pestdeterminatorapp.model.Characteristic;
import com.sbnz.pestdeterminatorapp.model.ControlMeasure;
import com.sbnz.pestdeterminatorapp.model.ControlMeasureType;
import com.sbnz.pestdeterminatorapp.model.Pest;
import com.sbnz.pestdeterminatorapp.model.PlantPart;
import com.sbnz.pestdeterminatorapp.model.PlantSpecies;
import com.sbnz.pestdeterminatorapp.model.Symptom;

@Repository
public class PestRepositoryImplementation implements PestRepository{
	
	private List<Pest> pests = new ArrayList<Pest>();	

	public PestRepositoryImplementation() {
		Pest p1 = new Pest("Liriomyza trifolii");
		Pest p2 = new Pest("Tuta absoluta");
		Pest p3 = new Pest("Helicoverpa armigera");
		Pest p4 = new Pest("Thrips tabaci");
		Pest p5 = new Pest("Nezara viridula ");
		Pest p6 = new Pest("Leptinotarsa decemlineata");
		Pest p7 = new Pest("Loxostege sticticalis");
		Pest p8 = new Pest("Myzus persicae");
		Pest p9 = new Pest("Gryllotalpa gryllotalpa");
		Pest p10 = new Pest("Aphis gossypii");
		Pest p11 = new Pest("Aculops lycopersici");
		Pest p12 = new Pest("Phthorimaea operculella");
		
		List<Symptom> symptoms1 = new LinkedList<>();
		symptoms1.add(Symptom.WHITE_SPOTS);
		symptoms1.add(Symptom.INDOORS);
		symptoms1.add(Symptom.WHITE_MINES);
		p1.setSymptoms(symptoms1);
		
		List<Symptom> symptoms2 = new LinkedList<>();
		symptoms2.add(Symptom.DRIED_LEAVES);
		symptoms2.add(Symptom.SHALLOW_WELLS);
		symptoms2.add(Symptom.WHITE_MINES);
		p2.setSymptoms(symptoms2);
		
		List<Symptom> symptoms3 = new LinkedList<>();
		symptoms3.add(Symptom.OPENINGS_ON_FRUIT_WALLS);
		symptoms3.add(Symptom.FUNGUS_ON_FRUIT);
		symptoms3.add(Symptom.FRUIT_ROT_AND_DECAY);
		symptoms3.add(Symptom.BUTTERFLY_FROM_MAY_TO_SEPTEMBER);
		p3.setSymptoms(symptoms3);
		
		List<Characteristic> characteristics3 = new LinkedList<>();
		characteristics3.add(Characteristic.GRAY_GREEN_CATERPILLAR_WITH_BACK_STRIPES);
		characteristics3.add(Characteristic.BUTTERFLY_GRAY_FRONT_YELLOWISH_BACK_WINGS);
		p3.setCharacteristics(characteristics3);
		
		List<Symptom> symptoms4 = new LinkedList<>();
		symptoms4.add(Symptom.WHITE_SPOTS);
		symptoms4.add(Symptom.DRIED_LEAVES);
		symptoms4.add(Symptom.TOMATO_MOSAIC_VIRUS);
		p4.setSymptoms(symptoms4);
		
		List<Symptom> symptoms5 = new LinkedList<>();
		symptoms5.add(Symptom.PALE_SHOOTS);
		symptoms5.add(Symptom.PALE_FRUITS);
		symptoms5.add(Symptom.SLOWED_FRUIT_GROWTH);
		symptoms5.add(Symptom.SPOTS_ON_FRUIT);
		symptoms5.add(Symptom.SPOTTING_AND_ROTTING);
		p5.setSymptoms(symptoms5);
		
		List<Symptom> symptoms6 = new LinkedList<>();
		symptoms6.add(Symptom.EATEN_LEAVES);
		p6.setSymptoms(symptoms6);
		
		List<Characteristic> characteristics6 = new LinkedList<>();
		characteristics6.add(Characteristic.OVAL_YELLOW_BODY_WITH_BLACK_STRIPES);
		characteristics6.add(Characteristic.ORANGE_EGGS);
		characteristics6.add(Characteristic.REDDISH_LARVA_WITH_BLACK_HEAD);
		p6.setCharacteristics(characteristics6);
		
		List<Symptom> symptoms7 = new LinkedList<>();
		symptoms7.add(Symptom.COBWEBS);
		symptoms7.add(Symptom.EATEN_LEAVES);
		p7.setSymptoms(symptoms7);
		
		List<Characteristic> characteristics7 = new LinkedList<>();
		characteristics7.add(Characteristic.PALE_BROWN_PUPA);
		characteristics7.add(Characteristic.GRAY_GREEN_CATERPILLAR_WITH_YELLOW_SIDE_STRIPES);
		p7.setCharacteristics(characteristics7);
		
		List<Symptom> symptoms8 = new LinkedList<>();
		symptoms8.add(Symptom.PEACH_WINTER_HOST);
		symptoms8.add(Symptom.HONEYDEW);
		symptoms8.add(Symptom.SOOT);
		p8.setSymptoms(symptoms8);
		
		List<Characteristic> characteristics8 = new LinkedList<>();
		characteristics8.add(Characteristic.WINGLESS_OVAL_LICE_REDDISH_GREEN_YELLOWISH);
		p8.setCharacteristics(characteristics8);
		
		List<Symptom> symptoms9 = new LinkedList<>();
		symptoms9.add(Symptom.CORRIDORS_IN_HUMUS_SOIL);
		p9.setSymptoms(symptoms9);
		
		List<Characteristic> characteristics9 = new LinkedList<>();
		characteristics9.add(Characteristic.ELONGATED_BROWN_BODY_WITH_MOLELIKE_LEGS);
		p9.setCharacteristics(characteristics9);
		
		List<Symptom> symptoms10 = new LinkedList<>();
		symptoms10.add(Symptom.DENSE_COLONIES);
		symptoms10.add(Symptom.CUCUMBER_MOSAIC_VIRUS);
		p10.setSymptoms(symptoms10);
		
		List<Characteristic> characteristics10 = new LinkedList<>();
		characteristics10.add(Characteristic.LIGHTGREEN_WINGLESS_LICE);
		p10.setCharacteristics(characteristics10);
		
		List<Symptom> symptoms11 = new LinkedList<>();
		symptoms11.add(Symptom.LEAVES_YELLOW_CURLING_ALONG_EDGES);
		symptoms11.add(Symptom.FRUITS_AS_IF_COVERED_WITH_CORK);
		symptoms11.add(Symptom.THE_FRUIT_SKIN_ROUGH_AND_CRACKS);
		symptoms11.add(Symptom.FRUIT_DOES_NOT_GROW_AND_DECAY);
		symptoms11.add(Symptom.FIRST_DAMAGES_TO_THE_LOWER_PARTS);
		p11.setSymptoms(symptoms11);
		
		List<Characteristic> characteristics11 = new LinkedList<>();
		characteristics11.add(Characteristic.INSECT_NOT_VISIBLE);
		p11.setCharacteristics(characteristics11);
		
		List<Symptom> symptoms12 = new LinkedList<>();
		symptoms12.add(Symptom.BUTTERFLY_FROM_APRIL_TO_OCTOBER);
		symptoms12.add(Symptom.MINES_BELOW_SURFACE);
		p12.setSymptoms(symptoms12);
		
		List<Characteristic> characteristics12 = new LinkedList<>();
		characteristics12.add(Characteristic.GRAYISH_WHITE_CATERPILLAR_WITH_BROWN_HEAD);
		characteristics12.add(Characteristic.PALE_BROWN_PUPA);
		characteristics12.add(Characteristic.SILK_COCOON);
		characteristics12.add(Characteristic.BUTTERFLY_BROWNISH_FRONT_WINGS_WITH_THREE_BLACK_SPOTS_BACK_WITH_FRINGE);
		p12.setCharacteristics(characteristics12);
				
		List<PlantSpecies> plantSpecies1 = new LinkedList<>();
		plantSpecies1.add(PlantSpecies.Cucumber);
		plantSpecies1.add(PlantSpecies.Tomato);
		plantSpecies1.add(PlantSpecies.Eggplant);
		plantSpecies1.add(PlantSpecies.Zucchini);
		p1.setPlantSpecies(plantSpecies1);
		
		List<PlantSpecies> plantSpecies2 = new LinkedList<>();
		plantSpecies2.add(PlantSpecies.Potato);
		plantSpecies2.add(PlantSpecies.Tomato);
		plantSpecies2.add(PlantSpecies.Eggplant);
		plantSpecies2.add(PlantSpecies.Pepper);
		p2.setPlantSpecies(plantSpecies2);
		
		List<PlantSpecies> plantSpecies3 = new LinkedList<>();
		plantSpecies3.add(PlantSpecies.Tomato);
		plantSpecies3.add(PlantSpecies.Pepper);
		p3.setPlantSpecies(plantSpecies3);
		
		List<PlantSpecies> plantSpecies4 = new LinkedList<>();
		plantSpecies4.add(PlantSpecies.Cucumber);
		plantSpecies4.add(PlantSpecies.Tomato);
		p4.setPlantSpecies(plantSpecies4);
		
		List<PlantSpecies> plantSpecies5 = new LinkedList<>();
		plantSpecies5.add(PlantSpecies.Potato);
		plantSpecies5.add(PlantSpecies.Tomato);
		plantSpecies5.add(PlantSpecies.Pepper);
		plantSpecies5.add(PlantSpecies.Zucchini);
		p5.setPlantSpecies(plantSpecies5);
		
		List<PlantSpecies> plantSpecies6 = new LinkedList<>();
		plantSpecies6.add(PlantSpecies.Potato);
		plantSpecies6.add(PlantSpecies.Tomato);
		plantSpecies6.add(PlantSpecies.Pepper);
		plantSpecies6.add(PlantSpecies.Eggplant);
		p6.setPlantSpecies(plantSpecies6);
		
		List<PlantSpecies> plantSpecies7 = new LinkedList<>();
		plantSpecies7.add(PlantSpecies.Pepper);
		plantSpecies7.add(PlantSpecies.Tomato);
		p7.setPlantSpecies(plantSpecies7);
		
		List<PlantSpecies> plantSpecies8 = new LinkedList<>();
		plantSpecies8.add(PlantSpecies.Potato);
		plantSpecies8.add(PlantSpecies.Tomato);
		plantSpecies8.add(PlantSpecies.Pepper);
		p8.setPlantSpecies(plantSpecies8);
		
		List<PlantSpecies> plantSpecies9 = new LinkedList<>();
		plantSpecies9.add(PlantSpecies.Cucumber);
		plantSpecies9.add(PlantSpecies.Tomato);
		plantSpecies9.add(PlantSpecies.Pepper);
		p9.setPlantSpecies(plantSpecies9);
		
		List<PlantSpecies> plantSpecies10 = new LinkedList<>();
		plantSpecies10.add(PlantSpecies.Cucumber);
		plantSpecies10.add(PlantSpecies.Tomato);
		plantSpecies10.add(PlantSpecies.Eggplant);
		plantSpecies10.add(PlantSpecies.Pepper);
		p10.setPlantSpecies(plantSpecies10);
		
		List<PlantSpecies> plantSpecies11 = new LinkedList<>();
		plantSpecies11.add(PlantSpecies.Potato);
		plantSpecies11.add(PlantSpecies.Tomato);
		plantSpecies11.add(PlantSpecies.Eggplant);
		plantSpecies11.add(PlantSpecies.Pepper);
		p11.setPlantSpecies(plantSpecies11);
		
		List<PlantSpecies> plantSpecies12 = new LinkedList<>();
		plantSpecies12.add(PlantSpecies.Potato);
		plantSpecies12.add(PlantSpecies.Tomato);
		plantSpecies12.add(PlantSpecies.Eggplant);
		p12.setPlantSpecies(plantSpecies12);
				
		List<PlantPart> plantParts1 = new LinkedList<>();
		plantParts1.add(PlantPart.Leaf);
		p1.setPlantParts(plantParts1);
		
		List<PlantPart> plantParts2 = new LinkedList<>();
		plantParts2.add(PlantPart.Leaf);
		plantParts2.add(PlantPart.Fruit);
		plantParts2.add(PlantPart.Stem);
		p2.setPlantParts(plantParts2);
		
		List<PlantPart> plantParts3 = new LinkedList<>();
		plantParts3.add(PlantPart.Fruit);
		p3.setPlantParts(plantParts3);
		
		List<PlantPart> plantParts4 = new LinkedList<>();
		plantParts4.add(PlantPart.Leaf);
		p4.setPlantParts(plantParts4);
		
		List<PlantPart> plantParts5 = new LinkedList<>();
		plantParts5.add(PlantPart.Fruit);
		plantParts5.add(PlantPart.Stem);
		p5.setPlantParts(plantParts5);
		
		List<PlantPart> plantParts6 = new LinkedList<>();
		plantParts6.add(PlantPart.Leaf);
		p6.setPlantParts(plantParts6);
		
		List<PlantPart> plantParts7 = new LinkedList<>();
		plantParts7.add(PlantPart.Leaf);
		p7.setPlantParts(plantParts7);
		
		List<PlantPart> plantParts8 = new LinkedList<>();
		plantParts8.add(PlantPart.Leaf);
		p8.setPlantParts(plantParts8);
		
		List<PlantPart> plantParts9 = new LinkedList<>();
		plantParts9.add(PlantPart.Roots);
		p9.setPlantParts(plantParts9);
		
		List<PlantPart> plantParts10 = new LinkedList<>();
		plantParts10.add(PlantPart.Leaf);
		p10.setPlantParts(plantParts10);
		
		List<PlantPart> plantParts11 = new LinkedList<>();
		plantParts11.add(PlantPart.Leaf);
		plantParts11.add(PlantPart.Stem);
		plantParts11.add(PlantPart.Fruit);
		p11.setPlantParts(plantParts11);
		
		List<PlantPart> plantParts12 = new LinkedList<>();
		plantParts12.add(PlantPart.Leaf);
		plantParts12.add(PlantPart.Stem);
		p12.setPlantParts(plantParts12);
		
		List<ControlMeasure> controlMeasures1 = new LinkedList<>();
		controlMeasures1.add(new ControlMeasure("Crop rotation", ControlMeasureType.Cultural));
		p1.setControlMeasures(controlMeasures1);
		
		List<ControlMeasure> controlMeasures6 = new LinkedList<>();
		controlMeasures6.add(new ControlMeasure("Hand-picking", ControlMeasureType.Mechanical));
		controlMeasures6.add(new ControlMeasure("Trap cropping", ControlMeasureType.Cultural));
		p6.setControlMeasures(controlMeasures6);
		
		pests.add(p1);
		pests.add(p2);
		pests.add(p3);
		pests.add(p4);
		pests.add(p5);
		pests.add(p6);
		pests.add(p7);
		pests.add(p8);
		pests.add(p9);
		pests.add(p10);
		pests.add(p11);
		pests.add(p12);	
	}

	@Override
	public List<Pest> findAll(){
		return pests;
	}
	
	@Override
	public Pest findByName(String name) {
		
		for(Pest pest : pests) {
			if (pest.getName().equals(name)) {
				return pest;
			}
		}
		return null;
	}
}
