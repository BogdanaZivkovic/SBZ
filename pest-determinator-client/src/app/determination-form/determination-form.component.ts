import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { PlantInput } from '../model/plantInput';
import { DeterminationFormService } from './determination-form.service';

@Component({
  selector: 'app-determination-form',
  templateUrl: './determination-form.component.html',
  styleUrls: ['./determination-form.component.css']
})
export class DeterminationFormComponent implements OnInit {

  errorMessage = '';
  plants: any[] = [];
  plantParts: Array<any> = [
    { name: 'Leaf', value: 'Leaf' },
    { name: 'Stem', value: 'Stem' },
    { name: 'Fruit', value: 'Fruit' },
    { name: 'Roots', value: 'Roots' }
  ];

  symptoms: Array<any> = [];

  public readonly determinationForm: FormGroup;
  
  constructor(private determinationFormService: DeterminationFormService, private formBuilder: FormBuilder) { 
    this.determinationForm = this.formBuilder.group({
      plant: ['', Validators.required],
      selectedPlantParts: new FormArray([]),
      selectedSymptoms: new FormArray([])
    });
  }

  ngOnInit(): void {
    this.getUserPlants();
    this.getSymptoms();
  }

  getUserPlants() {
    this.determinationFormService.getUserPlants().subscribe({
      next: plants => this.plants = plants,
      error: err => this.errorMessage = err
    })
  }

  getSymptoms() {
    this.determinationFormService.getSymptoms().subscribe({
      next: symptoms => this.symptoms = symptoms,
      error: err => this.errorMessage = err
    })
  }

  onCheckboxChange(event: any) {
    const selectedPlantParts = (this.determinationForm.get('selectedPlantParts') as FormArray);
    if (event.target.checked) {
      selectedPlantParts.push(new FormControl(event.target.value));
    } else {
      const index = selectedPlantParts.controls
      .findIndex(x => x.value === event.target.value);
      selectedPlantParts.removeAt(index);
    }
  }

  onSymptomCheckboxChange(event: any) {
    const selectedSymptoms = (this.determinationForm.get('selectedSymptoms') as FormArray);
    if (event.target.checked) {
      selectedSymptoms.push(new FormControl(event.target.value));
    } else {
      const index = selectedSymptoms.controls
      .findIndex(x => x.value === event.target.value);
      selectedSymptoms.removeAt(index);
    }
  }

  public onClickSubmit(): void {
    this.determinationFormService.determinePest().subscribe();
  }
}
