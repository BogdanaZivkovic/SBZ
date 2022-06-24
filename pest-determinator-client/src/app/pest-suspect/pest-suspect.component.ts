import { Component, OnInit } from '@angular/core';
import { DeterminationService } from '../service/determination.service';

@Component({
  selector: 'app-pest-suspect',
  templateUrl: './pest-suspect.component.html',
  styleUrls: ['./pest-suspect.component.css']
})
export class PestSuspectComponent implements OnInit {

  errorMessage = '';
  plants: any[] = [];
  plant: any;
  pestSuspects: any[] = [];

  constructor(private determinationService: DeterminationService) { }

  ngOnInit(): void {
    this.getUserPlants();
  }

  public onClickSubmit(): void {
    this.getPestSuspects(this.plant.id);
  } 

  getUserPlants() {
    this.determinationService.getUserPlants().subscribe({
      next: plants => this.plants = plants,
      error: err => this.errorMessage = err
    })
  }

  getPestSuspects(id: number) {
   this.determinationService.getPestSuspects(id).subscribe({
      next: pestSuspects => this.pestSuspects = pestSuspects,
      error: err => this.errorMessage = err
    })
  }
}
