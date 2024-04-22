import { Routes } from '@angular/router';
import {InicialComponent} from "./paginas/inicial/inicial.component";

export const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full'},
  { path: 'home', component: InicialComponent },
];
