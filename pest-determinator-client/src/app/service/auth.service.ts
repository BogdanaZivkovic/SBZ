import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  isLoggedIn: boolean = false;

  constructor(private http: HttpClient) { }

  public login() {
    return this.http.get('http://localhost:8080/users');
  }

}
