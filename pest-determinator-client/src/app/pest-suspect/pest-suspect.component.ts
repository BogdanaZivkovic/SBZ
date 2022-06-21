import { Component, OnInit } from '@angular/core';
import { DeterminationService } from '../service/determination.service';

@Component({
  selector: 'app-pest-suspect',
  templateUrl: './pest-suspect.component.html',
  styleUrls: ['./pest-suspect.component.css']
})
export class PestSuspectComponent implements OnInit {

  errorMessage = '';
  pestSuspects: any[] = [];

  constructor(private determinationService: DeterminationService) { }

  ngOnInit(): void {
    this.getPestSuspects();
  }

  getPestSuspects() {
   this.determinationService.getPestSuspects().subscribe({
      next: pestSuspects => this.pestSuspects = pestSuspects,
      error: err => this.errorMessage = err
    })
  }
}
