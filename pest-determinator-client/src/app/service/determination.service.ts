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

  getUserPlants(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/plants');
  }

  determinePest(): Observable<any> {
    return this.http.get<any> ('http://localhost:8080/determination');
  }

}

