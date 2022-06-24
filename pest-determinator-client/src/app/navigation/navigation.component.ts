import { Component, OnInit } from '@angular/core';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  constructor(public readonly authService: AuthService) { }

  ngOnInit(): void {
  }

  signOut() {
    this.authService.isLoggedIn = false;
  }
}
