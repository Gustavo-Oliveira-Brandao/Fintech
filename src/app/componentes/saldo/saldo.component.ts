import { Component } from '@angular/core';

@Component({
  selector: 'app-saldo',
  standalone: true,
  imports: [],
  templateUrl: './saldo.component.html',
  styleUrl: './saldo.component.sass'
})
export class SaldoComponent {

  saldo:number = 500;
}
