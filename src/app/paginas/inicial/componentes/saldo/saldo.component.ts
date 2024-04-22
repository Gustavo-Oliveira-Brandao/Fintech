import { SaldoService } from './../../../../shared/servicos/saldo.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-saldo',
  standalone: true,
  imports: [],
  templateUrl: './saldo.component.html',
  styleUrl: './saldo.component.css'
})
export class SaldoComponent {

  constructor(protected SaldoService:SaldoService){}
}
