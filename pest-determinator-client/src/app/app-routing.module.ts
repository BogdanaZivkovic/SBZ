import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeterminationFormComponent } from './determination-form/determination-form.component';
import { LoginComponent } from './login/login.component';
import { PestSuspectComponent } from './pest-suspect/pest-suspect.component';
import { ReportComponent } from './report/report.component';

const routes: Routes = [
  { path: 'determination-form', component: DeterminationFormComponent},
  { path: 'login', component: LoginComponent},
  { path: 'pest-suspect', component: PestSuspectComponent},
  { path: 'report', component: ReportComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
