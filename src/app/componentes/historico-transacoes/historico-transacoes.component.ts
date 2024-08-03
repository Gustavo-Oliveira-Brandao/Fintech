import { Component } from '@angular/core';
import { CarteiraComponent } from "../carteira/carteira.component";
import { RouterLink, RouterLinkActive } from '@angular/router';
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { DatePipe } from '@angular/common';
import { CriarTransacaoComponent } from "../criar-transacao/criar-transacao.component";
import { ControleModalService } from '../../shared/servicos/controle-modal.service';

@Component({
  selector: 'app-historico-transacoes',
  standalone: true,
  imports: [CarteiraComponent, RouterLink, RouterLinkActive, DatePipe, CriarTransacaoComponent],
  templateUrl: './historico-transacoes.component.html',
  styleUrl: './historico-transacoes.component.sass'
})
export class HistoricoTransacoesComponent {

  constructor(protected usuario:UsuarioService, protected modal:ControleModalService){}

  criarTransacaoEstaAberto:boolean = false
  carteiraIndex:number = 1


}
