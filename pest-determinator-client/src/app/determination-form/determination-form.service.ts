import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeterminationFormService {

  constructor(private http: HttpClient) { }

  getPlantSpecies(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/species');
  }

  getPlantParts(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/parts');
  }

  getSymptoms(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/symptoms');
  }

}
