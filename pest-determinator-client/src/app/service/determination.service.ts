import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeterminationService {

  constructor(private http: HttpClient) { }
  
  getSymptoms(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/symptoms');
  }

  getControlMeasureTypes(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/controlMeasureTypes');
  }

  getUserPlants(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/plants');
  }

  getPlantParts(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/determination/plantParts');
  }

  determinePest(determinationInputDTO: any): Observable<any> {
    return this.http.post<any> ('http://localhost:8080/determination', determinationInputDTO);
  }

  getReport(): Observable<any> {
    return this.http.get<any> ('http://localhost:8080/determination/report');
  }

  getPestSuspects(): Observable<any> {
    return this.http.get<any> ('http://localhost:8080/determination/pestSuspect');
  }
}

