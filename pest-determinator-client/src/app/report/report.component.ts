import { Component, OnInit } from '@angular/core';
import { DeterminationService } from '../service/determination.service';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})
export class ReportComponent implements OnInit {

  errorMessage = '';
  plants: any[] = [];

  constructor(private determinationService: DeterminationService) { }

  ngOnInit(): void {
    this.getReport();
  }

  getReport() {
    this.determinationService.getReport().subscribe({
       next: plants => this.plants = plants,
       error: err => this.errorMessage = err
     })
   }
}
