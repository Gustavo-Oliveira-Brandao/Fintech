import { Component } from '@angular/core';
import { CarteiraComponent } from "../carteira/carteira.component";

@Component({
  selector: 'app-historico-transacoes',
  standalone: true,
  imports: [CarteiraComponent],
  templateUrl: './historico-transacoes.component.html',
  styleUrl: './historico-transacoes.component.sass'
})
export class HistoricoTransacoesComponent {

  carteira:number = 1
}
