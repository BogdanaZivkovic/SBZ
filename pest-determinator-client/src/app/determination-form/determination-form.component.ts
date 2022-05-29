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
  user: any;
  plant: any;
  plantPartsList: any[] = [];
  symptomsList: any[] = [];
  determinationForm: FormGroup;
  
  constructor(private determinationFormService: DeterminationFormService, private formBuilder: FormBuilder) { 
    this.determinationForm = this.formBuilder.group({
      plant: ['', Validators.required],
    });
  }

  ngOnInit(): void {
    this.getUser();
  }

  getUser() {
    this.determinationFormService.getUser().subscribe({
      next: user => this.user = user,
      error: err => this.errorMessage = err
    })
  }

  getSymptoms() {
    this.determinationFormService.getSymptoms().subscribe({
      next: (data: any[]) => this.symptomsList = data,
      error: (err: any) => this.errorMessage = err
    });
  }

  public onClickSubmit(): void {
  }

}
