import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {CabecalhoComponent} from "./cabecalho/cabecalho.component";
import { InicialComponent } from './paginas/inicial/inicial.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, CabecalhoComponent, InicialComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Financas-smart';
}
