import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeterminationFormComponent } from './determination-form/determination-form.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: 'determination-form', component: DeterminationFormComponent},
  { path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
