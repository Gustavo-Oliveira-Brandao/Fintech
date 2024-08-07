import { Component } from '@angular/core';
import { SaldoComponent } from "../../componentes/saldo/saldo.component";
import { CarteiraComponent } from "../../componentes/carteira/carteira.component";
import { BotaoAbaComponent } from "../../componentes/botao-aba/botao-aba.component";
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { RouterLink, RouterLinkActive, Routes } from '@angular/router';
import { HistoricoTransacoesComponent } from '../../componentes/historico-transacoes/historico-transacoes.component';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { CriarCarteiraComponent } from "../../componentes/criar-carteira/criar-carteira.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [SaldoComponent, CarteiraComponent, BotaoAbaComponent, RouterLink, RouterLinkActive, CriarCarteiraComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.sass'
})
export class HomeComponent {


  constructor(protected usuario: UsuarioService, protected modal:ControleModalService) { }
}
