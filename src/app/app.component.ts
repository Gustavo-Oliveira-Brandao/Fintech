import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SaldoComponent } from './componentes/saldo/saldo.component';
import { UsuarioService } from './shared/servicos/usuario.service';
import { HistoricoTransacoesComponent } from './componentes/historico-transacoes/historico-transacoes.component';
import { CarteiraComponent } from "./componentes/carteira/carteira.component";
import { BotaoAbaComponent } from "./componentes/botao-aba/botao-aba.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SaldoComponent, HistoricoTransacoesComponent, CarteiraComponent, BotaoAbaComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.sass'
})
export class AppComponent {
  title = 'fintech';

}
