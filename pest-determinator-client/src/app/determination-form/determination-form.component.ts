import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { determinationInputDTO } from '../model/determinationInputDTO';
import { DeterminationService } from '../service/determination.service';

@Component({
  selector: 'app-determination-form',
  templateUrl: './determination-form.component.html',
  styleUrls: ['./determination-form.component.css']
})
export class DeterminationFormComponent implements OnInit {

  errorMessage = '';

  plants: any[] = [];
  plantParts: Array<any> = [];
  symptoms: Array<any> = [];
  controlMeasureTypes: any[] = [];

  selectedSymptoms: Set<any> = new Set<any>();
  selectedPlantParts: Set<any> = new Set<any>();

  plant: any;
  plantSpecies: any;
  controlMeasureType: any;
  addedSymptoms: Array<any> = [];
  addedPlantParts: Array<any> = [];
  determinedPestDTO: any;
  pestHistory: Array<any> = [];
  controlMeasure: any;

  constructor(private determinationService: DeterminationService) { }

  ngOnInit(): void {
    this.getUserPlants();
    this.getSymptoms();
    this.getControlMeasureTypes();
    this.getPlantParts();
  }

  public onClickSubmit(): void {
    let dto: determinationInputDTO = {
      id: this.plant.id,
      plantSpecies: this.plant.plantSpecies,
      symptoms: this.addedSymptoms,
      affectedParts: this.addedPlantParts,
      controlMeasureType: this.controlMeasureType
    };

    this.determinationService.determinePest(dto).subscribe({
      next: (data) => { 
        this.determinedPestDTO = data;
        this.pestHistory = this.determinedPestDTO.plant.pestHistory;
        this.controlMeasure = this.pestHistory[this.pestHistory.length - 1].controlMeasure
      },
      error: err => this.errorMessage = err
    });
  } 

  getUserPlants() {
    this.determinationService.getUserPlants().subscribe({
      next: plants => this.plants = plants,
      error: err => this.errorMessage = err
    })
  }

  getSymptoms() {
    this.determinationService.getSymptoms().subscribe({
      next: symptoms => this.symptoms = symptoms,
      error: err => this.errorMessage = err
    })
  }

  getControlMeasureTypes() {
    this.determinationService.getControlMeasureTypes().subscribe({
      next: controlMeasureTypes => this.controlMeasureTypes = controlMeasureTypes,
      error: err => this.errorMessage = err
    })
  }

  getPlantParts() {
    this.determinationService.getPlantParts().subscribe({
      next: plantParts => this.plantParts = plantParts,
      error: err => this.errorMessage = err
    })
  }

  onRowClick(symptom: any) {
    if(this.selectedSymptoms.has(symptom)) {
     this.selectedSymptoms.delete(symptom);
    }
    else {
      this.selectedSymptoms.add(symptom);
    }
  }

  onRowClickPlantPart(plantPart: any) {
    if(this.selectedPlantParts.has(plantPart)) {
      this.selectedPlantParts.delete(plantPart);
     }
     else {
       this.selectedPlantParts.add(plantPart);
     }
  }

  rowIsSelected(id: number) {
    return this.selectedSymptoms.has(id);
  }

  rowIsPlantPartSelected(id: number) {
    return this.selectedPlantParts.has(id);
  }

  getSelectedRows(){
    return this.symptoms.filter(x => this.selectedSymptoms.has(x.id));
  }

  getSelectedRowsPlantParts(){
    return this.plantParts.filter(x => this.selectedPlantParts.has(x.id));
  }

  onLogClick() {
    for(let symptom of this.selectedSymptoms) {
      if(!this.addedSymptoms.includes(symptom)) {
        this.addedSymptoms.push(symptom);
      }
    }
  }

  onClick() {
    for(let plantPart of this.selectedPlantParts) {
      if(!this.addedPlantParts.includes(plantPart)) {
        this.addedPlantParts.push(plantPart);
      }
    }
  }

  removeSymptom(symptom: any) {
    this.addedSymptoms.splice(this.addedSymptoms.indexOf(symptom), 1);
  }

  removePlantPart(plantPart: any) {
    this.addedPlantParts.splice(this.addedPlantParts.indexOf(plantPart), 1);
  }
}
