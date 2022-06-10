import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public authService: AuthService, public router: Router) { }

  
  hide = true;
  username!: string;
  password!: string;
  errorMessage!: string;

  ngOnInit(): void { }

  public login() {
    this.authService.login().subscribe({
      next: (data) => {
        this.authService.isLoggedIn = true;
        this.router.navigate(['determination-form']);
      },
      error: (err) => {alert("An unexpected error!")}
    });
  }
}
