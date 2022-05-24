import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DeterminationFormService } from './determination-form.service';

@Component({
  selector: 'app-determination-form',
  templateUrl: './determination-form.component.html',
  styleUrls: ['./determination-form.component.css']
})
export class DeterminationFormComponent implements OnInit {

  errorMessage = '';
  plantSpeciesList: any[] = [];
  plantPartsList: any[] = [];
  symptomsList: any[] = [];
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  
  constructor(private determinationFormService: DeterminationFormService, private formBuilder: FormBuilder) { 
    this.firstFormGroup = this.formBuilder.group({
      plantSpecies: ['', Validators.required],
      plantParts: []
    });

    this.secondFormGroup = this.formBuilder.group({
      symptoms: []
    });
  }

  ngOnInit(): void {
    this.determinationFormService.getPlantSpecies().subscribe({
      next: (data: any[]) => this.plantSpeciesList = data,
      error: (err: any) => this.errorMessage = err
    });
    this.determinationFormService.getSymptoms().subscribe({
      next: (data: any[]) => this.symptomsList = data,
      error: (err: any) => this.errorMessage = err
    });
    this.determinationFormService.getPlantParts().subscribe({
      next: (data: any[]) => this.plantPartsList = data,
      error: (err: any) => this.errorMessage = err
    });
  }

  submit(){

    console.log(this.firstFormGroup.value);
    console.log(this.secondFormGroup.value);

}

}
