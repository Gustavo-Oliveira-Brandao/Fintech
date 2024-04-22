import { Component } from '@angular/core';
import {SaldoComponent} from "./componentes/saldo/saldo.component";
import { BotaoAdicionarComponent } from './componentes/botao-adicionar/botao-adicionar.component';
import { BotaoHistoricoComponent } from './componentes/botao-historico/botao-historico.component';
import { GastoDesseMesComponent } from './componentes/gasto-desse-mes/gasto-desse-mes.component';

@Component({
  selector: 'app-inicial',
  standalone: true,
  imports: [ SaldoComponent, BotaoAdicionarComponent, BotaoHistoricoComponent, GastoDesseMesComponent ],
  templateUrl: './inicial.component.html',
  styleUrl: './inicial.component.css'
})
export class InicialComponent {

}
