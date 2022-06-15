package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

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
		
		List<Symptom> symptoms1 = new ArrayList<>();
		symptoms1.add(Symptom.WHITE_SPOTS);
		symptoms1.add(Symptom.INDOORS);
		symptoms1.add(Symptom.WHITE_MINES);
		p1.setSymptoms(symptoms1);
		
		List<Symptom> symptoms2 = new ArrayList<>();
		symptoms2.add(Symptom.DRIED_LEAVES);
		symptoms2.add(Symptom.SHALLOW_WELLS);
		symptoms2.add(Symptom.WHITE_MINES);
		symptoms2.add(Symptom.WHITE_SPOTS);
		p2.setSymptoms(symptoms2);
		
		List<Symptom> symptoms3 = new ArrayList<>();
		symptoms3.add(Symptom.GRAY_GREEN_CATERPILLAR_WITH_BACK_STRIPES);
		symptoms3.add(Symptom.OPENINGS_ON_FRUIT_WALLS);
		symptoms3.add(Symptom.FUNGUS_ON_FRUIT);
		symptoms3.add(Symptom.FRUIT_ROT_AND_DECAY);
		symptoms3.add(Symptom.BUTTERFLY_GRAY_FRONT_YELLOWISH_BACK_WINGS);
		symptoms3.add(Symptom.BUTTERFLY_FROM_MAY_TO_SEPTEMBER);
		p3.setSymptoms(symptoms3);
		
		List<Symptom> symptoms4 = new ArrayList<>();
		symptoms4.add(Symptom.WHITE_SPOTS);
		symptoms4.add(Symptom.DRIED_LEAVES);
		symptoms4.add(Symptom.TOMATO_MOSAIC_VIRUS);
		p4.setSymptoms(symptoms4);
		
		List<Symptom> symptoms5 = new ArrayList<>();
		symptoms5.add(Symptom.PALE_SHOOTS);
		symptoms5.add(Symptom.PALE_FRUITS);
		symptoms5.add(Symptom.SLOWED_FRUIT_GROWTH);
		symptoms5.add(Symptom.SPOTS_ON_FRUIT);
		symptoms5.add(Symptom.SPOTTING_AND_ROTTING);
		p5.setSymptoms(symptoms5);
		
		List<Symptom> symptoms6 = new ArrayList<>();
		symptoms6.add(Symptom.OVAL_YELLOW_BODY_WITH_BLACK_STRIPES);
		symptoms6.add(Symptom.ORANGE_EGGS);
		symptoms6.add(Symptom.REDDISH_LARVA_WITH_BLACK_HEAD);
		symptoms6.add(Symptom.EATEN_LEAVES);
		p6.setSymptoms(symptoms6);
		
		List<Symptom> symptoms7 = new ArrayList<>();
		symptoms7.add(Symptom.PALE_BROWN_PUPA);
		symptoms7.add(Symptom.GRAY_GREEN_CATERPILLAR_WITH_YELLOW_SIDE_STRIPES);
		symptoms7.add(Symptom.COBWEBS);
		symptoms7.add(Symptom.EATEN_LEAVES);
		p7.setSymptoms(symptoms7);
		
		List<Symptom> symptoms8 = new ArrayList<>();
		symptoms8.add(Symptom.PEACH_WINTER_HOST);
		symptoms8.add(Symptom.HONEYDEW);
		symptoms8.add(Symptom.SOOT);
		symptoms8.add(Symptom.WINGLESS_OVAL_LICE_REDDISH_GREEN_YELLOWISH);
		p8.setSymptoms(symptoms8);
		
		List<Symptom> symptoms9 = new ArrayList<>();
		symptoms9.add(Symptom.CORRIDORS_IN_HUMUS_SOIL);
		symptoms9.add(Symptom.ELONGATED_BROWN_BODY_WITH_MOLELIKE_LEGS);
		p9.setSymptoms(symptoms9);
		
		List<Symptom> symptoms10 = new ArrayList<>();
		symptoms10.add(Symptom.DENSE_COLONIES);
		symptoms10.add(Symptom.CUCUMBER_MOSAIC_VIRUS);
		symptoms10.add(Symptom.LIGHTGREEN_WINGLESS_LICE);
		p10.setSymptoms(symptoms10);
		
		List<Symptom> symptoms11 = new ArrayList<>();
		symptoms11.add(Symptom.LEAVES_YELLOW_CURLING_ALONG_EDGES);
		symptoms11.add(Symptom.FRUITS_AS_IF_COVERED_WITH_CORK);
		symptoms11.add(Symptom.THE_FRUIT_SKIN_ROUGH_AND_CRACKS);
		symptoms11.add(Symptom.FRUIT_DOES_NOT_GROW_AND_DECAY);
		symptoms11.add(Symptom.FIRST_DAMAGES_TO_THE_LOWER_PARTS);
		symptoms11.add(Symptom.INSECT_NOT_VISIBLE);
		p11.setSymptoms(symptoms11);
		
		List<Symptom> symptoms12 = new ArrayList<>();
		symptoms12.add(Symptom.BUTTERFLY_FROM_APRIL_TO_OCTOBER);
		symptoms12.add(Symptom.MINES_BELOW_SURFACE);
		symptoms12.add(Symptom.GRAYISH_WHITE_CATERPILLAR_WITH_BROWN_HEAD);
		symptoms12.add(Symptom.PALE_BROWN_PUPA);
		symptoms12.add(Symptom.SILK_COCOON);
		symptoms12.add(Symptom.BUTTERFLY_BROWNISH_FRONT_WINGS_WITH_THREE_BLACK_SPOTS_BACK_WITH_FRINGE);
		p12.setSymptoms(symptoms12);
				
		List<PlantSpecies> plantSpecies1 = new ArrayList<>();
		plantSpecies1.add(PlantSpecies.Cucumber);
		plantSpecies1.add(PlantSpecies.Tomato);
		plantSpecies1.add(PlantSpecies.Eggplant);
		plantSpecies1.add(PlantSpecies.Zucchini);
		p1.setPlantSpecies(plantSpecies1);
		
		List<PlantSpecies> plantSpecies2 = new ArrayList<>();
		plantSpecies2.add(PlantSpecies.Potato);
		plantSpecies2.add(PlantSpecies.Tomato);
		plantSpecies2.add(PlantSpecies.Eggplant);
		plantSpecies2.add(PlantSpecies.Pepper);
		p2.setPlantSpecies(plantSpecies2);
		
		List<PlantSpecies> plantSpecies3 = new ArrayList<>();
		plantSpecies3.add(PlantSpecies.Tomato);
		plantSpecies3.add(PlantSpecies.Pepper);
		p3.setPlantSpecies(plantSpecies3);
		
		List<PlantSpecies> plantSpecies4 = new ArrayList<>();
		plantSpecies4.add(PlantSpecies.Cucumber);
		plantSpecies4.add(PlantSpecies.Tomato);
		p4.setPlantSpecies(plantSpecies4);
		
		List<PlantSpecies> plantSpecies5 = new ArrayList<>();
		plantSpecies5.add(PlantSpecies.Potato);
		plantSpecies5.add(PlantSpecies.Tomato);
		plantSpecies5.add(PlantSpecies.Pepper);
		plantSpecies5.add(PlantSpecies.Zucchini);
		p5.setPlantSpecies(plantSpecies5);
		
		List<PlantSpecies> plantSpecies6 = new ArrayList<>();
		plantSpecies6.add(PlantSpecies.Potato);
		plantSpecies6.add(PlantSpecies.Tomato);
		plantSpecies6.add(PlantSpecies.Pepper);
		plantSpecies6.add(PlantSpecies.Eggplant);
		p6.setPlantSpecies(plantSpecies6);
		
		List<PlantSpecies> plantSpecies7 = new ArrayList<>();
		plantSpecies7.add(PlantSpecies.Pepper);
		plantSpecies7.add(PlantSpecies.Tomato);
		p7.setPlantSpecies(plantSpecies7);
		
		List<PlantSpecies> plantSpecies8 = new ArrayList<>();
		plantSpecies8.add(PlantSpecies.Potato);
		plantSpecies8.add(PlantSpecies.Tomato);
		plantSpecies8.add(PlantSpecies.Pepper);
		p8.setPlantSpecies(plantSpecies8);
		
		List<PlantSpecies> plantSpecies9 = new ArrayList<>();
		plantSpecies9.add(PlantSpecies.Cucumber);
		plantSpecies9.add(PlantSpecies.Tomato);
		plantSpecies9.add(PlantSpecies.Pepper);
		p9.setPlantSpecies(plantSpecies9);
		
		List<PlantSpecies> plantSpecies10 = new ArrayList<>();
		plantSpecies10.add(PlantSpecies.Cucumber);
		plantSpecies10.add(PlantSpecies.Tomato);
		plantSpecies10.add(PlantSpecies.Eggplant);
		plantSpecies10.add(PlantSpecies.Pepper);
		p10.setPlantSpecies(plantSpecies10);
		
		List<PlantSpecies> plantSpecies11 = new ArrayList<>();
		plantSpecies11.add(PlantSpecies.Potato);
		plantSpecies11.add(PlantSpecies.Tomato);
		plantSpecies11.add(PlantSpecies.Eggplant);
		plantSpecies11.add(PlantSpecies.Pepper);
		p11.setPlantSpecies(plantSpecies11);
		
		List<PlantSpecies> plantSpecies12 = new ArrayList<>();
		plantSpecies12.add(PlantSpecies.Potato);
		plantSpecies12.add(PlantSpecies.Tomato);
		plantSpecies12.add(PlantSpecies.Eggplant);
		p12.setPlantSpecies(plantSpecies12);
				
		List<PlantPart> plantParts1 = new ArrayList<>();
		plantParts1.add(PlantPart.Leaf);
		p1.setPlantParts(plantParts1);
		
		List<PlantPart> plantParts2 = new ArrayList<>();
		plantParts2.add(PlantPart.Leaf);
		plantParts2.add(PlantPart.Fruit);
		plantParts2.add(PlantPart.Stem);
		p2.setPlantParts(plantParts2);
		
		List<PlantPart> plantParts3 = new ArrayList<>();
		plantParts3.add(PlantPart.Fruit);
		p3.setPlantParts(plantParts3);
		
		List<PlantPart> plantParts4 = new ArrayList<>();
		plantParts4.add(PlantPart.Leaf);
		p4.setPlantParts(plantParts4);
		
		List<PlantPart> plantParts5 = new ArrayList<>();
		plantParts5.add(PlantPart.Fruit);
		plantParts5.add(PlantPart.Stem);
		p5.setPlantParts(plantParts5);
		
		List<PlantPart> plantParts6 = new ArrayList<>();
		plantParts6.add(PlantPart.Leaf);
		p6.setPlantParts(plantParts6);
		
		List<PlantPart> plantParts7 = new ArrayList<>();
		plantParts7.add(PlantPart.Leaf);
		p7.setPlantParts(plantParts7);
		
		List<PlantPart> plantParts8 = new ArrayList<>();
		plantParts8.add(PlantPart.Leaf);
		p8.setPlantParts(plantParts8);
		
		List<PlantPart> plantParts9 = new ArrayList<>();
		plantParts9.add(PlantPart.Roots);
		p9.setPlantParts(plantParts9);
		
		List<PlantPart> plantParts10 = new ArrayList<>();
		plantParts10.add(PlantPart.Leaf);
		p10.setPlantParts(plantParts10);
		
		List<PlantPart> plantParts11 = new ArrayList<>();
		plantParts11.add(PlantPart.Leaf);
		plantParts11.add(PlantPart.Stem);
		plantParts11.add(PlantPart.Fruit);
		p11.setPlantParts(plantParts11);
		
		List<PlantPart> plantParts12 = new ArrayList<>();
		plantParts12.add(PlantPart.Leaf);
		plantParts12.add(PlantPart.Stem);
		p12.setPlantParts(plantParts12);
		
		List<ControlMeasure> controlMeasures1 = new ArrayList<>();
		controlMeasures1.add(new ControlMeasure("Fly swatters", ControlMeasureType.Mechanical));
		controlMeasures1.add(new ControlMeasure("Trap cropping", ControlMeasureType.Cultural));
		controlMeasures1.add(new ControlMeasure("Red sphere traps", ControlMeasureType.Physical));		
		controlMeasures1.add(new ControlMeasure("Carbaryl (1A)", ControlMeasureType.Chemical));
		controlMeasures1.add(new ControlMeasure("Predators", ControlMeasureType.Biological));
		p1.setControlMeasures(controlMeasures1);
		
		List<ControlMeasure> controlMeasures2 = new ArrayList<>();
		controlMeasures2.add(new ControlMeasure("Mouse traps", ControlMeasureType.Mechanical));
		controlMeasures2.add(new ControlMeasure("Planned time of planting", ControlMeasureType.Cultural));
		controlMeasures2.add(new ControlMeasure("Floating row covers", ControlMeasureType.Physical));		
		controlMeasures2.add(new ControlMeasure("Acetamiprid (4A)", ControlMeasureType.Chemical));
		controlMeasures2.add(new ControlMeasure("Parasites", ControlMeasureType.Biological));
		p2.setControlMeasures(controlMeasures2);
		
		List<ControlMeasure> controlMeasures3 = new ArrayList<>();
		controlMeasures3.add(new ControlMeasure("Hand-picking", ControlMeasureType.Mechanical));
		controlMeasures3.add(new ControlMeasure("Crop rotation", ControlMeasureType.Cultural));
		controlMeasures3.add(new ControlMeasure("Window screens", ControlMeasureType.Physical));
		controlMeasures3.add(new ControlMeasure("Cyfluthrin (3A)", ControlMeasureType.Chemical));
		controlMeasures3.add(new ControlMeasure("Diseases", ControlMeasureType.Biological));
		p3.setControlMeasures(controlMeasures3);
		
		List<ControlMeasure> controlMeasures4 = new ArrayList<>();
		controlMeasures4.add(new ControlMeasure("Tillage", ControlMeasureType.Mechanical));
		controlMeasures4.add(new ControlMeasure("Crop rotation", ControlMeasureType.Cultural));
		controlMeasures4.add(new ControlMeasure("Glueboard traps", ControlMeasureType.Physical));
		controlMeasures4.add(new ControlMeasure("Carbaryl (1A)", ControlMeasureType.Chemical));
		controlMeasures4.add(new ControlMeasure("Predators", ControlMeasureType.Biological));
		p4.setControlMeasures(controlMeasures4);
		
		List<ControlMeasure> controlMeasures5 = new ArrayList<>();
		controlMeasures5.add(new ControlMeasure("Hand-picking", ControlMeasureType.Mechanical));
		controlMeasures5.add(new ControlMeasure("Sanitation", ControlMeasureType.Cultural));
		controlMeasures5.add(new ControlMeasure("Plant collars", ControlMeasureType.Physical));	
		controlMeasures5.add(new ControlMeasure("Malathion (1B)", ControlMeasureType.Chemical));
		controlMeasures5.add(new ControlMeasure("Parasites", ControlMeasureType.Biological));
		p5.setControlMeasures(controlMeasures5);
		
		List<ControlMeasure> controlMeasures6 = new ArrayList<>();
		controlMeasures6.add(new ControlMeasure("Shaking plants", ControlMeasureType.Mechanical));
		controlMeasures6.add(new ControlMeasure("Trap cropping", ControlMeasureType.Cultural));
		controlMeasures6.add(new ControlMeasure("Floating row covers", ControlMeasureType.Physical));
		controlMeasures6.add(new ControlMeasure("Acetamiprid (4A)", ControlMeasureType.Chemical));
		controlMeasures6.add(new ControlMeasure("Diseases", ControlMeasureType.Biological));
		p6.setControlMeasures(controlMeasures6);
		
		List<ControlMeasure> controlMeasures7 = new ArrayList<>();
		controlMeasures7.add(new ControlMeasure("Fly swatters", ControlMeasureType.Mechanical));
		controlMeasures7.add(new ControlMeasure("Crop rotation", ControlMeasureType.Cultural));
		controlMeasures7.add(new ControlMeasure("Red sphere traps", ControlMeasureType.Physical));			
		controlMeasures7.add(new ControlMeasure("Permethrin (3A)", ControlMeasureType.Chemical));
		controlMeasures7.add(new ControlMeasure("Predators", ControlMeasureType.Biological));
		p7.setControlMeasures(controlMeasures7);
		
		List<ControlMeasure> controlMeasures8 = new ArrayList<>();
		controlMeasures8.add(new ControlMeasure("Mouse traps", ControlMeasureType.Mechanical));
		controlMeasures8.add(new ControlMeasure("Trap cropping", ControlMeasureType.Cultural));
		controlMeasures8.add(new ControlMeasure("Red sphere traps", ControlMeasureType.Physical));
		controlMeasures8.add(new ControlMeasure("Malathion (1B)", ControlMeasureType.Chemical));
		controlMeasures8.add(new ControlMeasure("Parasites", ControlMeasureType.Biological));
		p8.setControlMeasures(controlMeasures8);
		
		List<ControlMeasure> controlMeasures9 = new ArrayList<>();
		controlMeasures9.add(new ControlMeasure("Tillage", ControlMeasureType.Mechanical));
		controlMeasures9.add(new ControlMeasure("Planned time of planting", ControlMeasureType.Cultural));
		controlMeasures9.add(new ControlMeasure("Window screens", ControlMeasureType.Physical));	
		controlMeasures9.add(new ControlMeasure("Carbaryl (1A)", ControlMeasureType.Chemical));
		controlMeasures9.add(new ControlMeasure("Diseases", ControlMeasureType.Biological));
		p9.setControlMeasures(controlMeasures9);
		
		List<ControlMeasure> controlMeasures10 = new ArrayList<>();
		controlMeasures10.add(new ControlMeasure("Mouse traps", ControlMeasureType.Mechanical));
		controlMeasures10.add(new ControlMeasure("Sanitation", ControlMeasureType.Cultural));
		controlMeasures10.add(new ControlMeasure("Plant collars", ControlMeasureType.Physical));
		controlMeasures10.add(new ControlMeasure("Malathion (1B)", ControlMeasureType.Chemical));
		controlMeasures10.add(new ControlMeasure("Parasites", ControlMeasureType.Biological));		
		p10.setControlMeasures(controlMeasures10);
		
		List<ControlMeasure> controlMeasures11 = new ArrayList<>();
		controlMeasures11.add(new ControlMeasure("Shaking plants", ControlMeasureType.Mechanical));
		controlMeasures11.add(new ControlMeasure("Crop rotation", ControlMeasureType.Cultural));
		controlMeasures11.add(new ControlMeasure("Red sphere traps", ControlMeasureType.Physical));
		controlMeasures11.add(new ControlMeasure("Permethrin (3A)", ControlMeasureType.Chemical));
		controlMeasures11.add(new ControlMeasure("Predators", ControlMeasureType.Biological));
		p11.setControlMeasures(controlMeasures11);
		
		List<ControlMeasure> controlMeasures12 = new ArrayList<>();
		controlMeasures12.add(new ControlMeasure("Hand-picking", ControlMeasureType.Mechanical));
		controlMeasures12.add(new ControlMeasure("Trap cropping", ControlMeasureType.Cultural));
		controlMeasures12.add(new ControlMeasure("Glueboard traps", ControlMeasureType.Physical));
		controlMeasures12.add(new ControlMeasure("Carbaryl (1A)", ControlMeasureType.Chemical));
		controlMeasures12.add(new ControlMeasure("Diseases", ControlMeasureType.Biological));
		p12.setControlMeasures(controlMeasures12);
		
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
