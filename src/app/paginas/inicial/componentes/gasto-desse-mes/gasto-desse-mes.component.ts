import { SaldoService } from './../../../../shared/servicos/saldo.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-gasto-desse-mes',
  standalone: true,
  imports: [],
  templateUrl: './gasto-desse-mes.component.html',
  styleUrl: './gasto-desse-mes.component.css'
})
export class GastoDesseMesComponent {

  constructor(protected SaldoService: SaldoService){}

}
