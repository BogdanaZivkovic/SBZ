import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeterminationFormComponent } from './determination-form/determination-form.component';

const routes: Routes = [
  { path: 'determination-form', component: DeterminationFormComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
