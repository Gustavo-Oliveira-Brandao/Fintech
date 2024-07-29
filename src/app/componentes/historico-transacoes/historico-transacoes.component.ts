import { Component } from '@angular/core';
import { CarteiraComponent } from "../carteira/carteira.component";
import { RouterLink, RouterLinkActive } from '@angular/router';
import { UsuarioService } from '../../shared/servicos/usuario.service';

@Component({
  selector: 'app-historico-transacoes',
  standalone: true,
  imports: [CarteiraComponent, RouterLink, RouterLinkActive],
  templateUrl: './historico-transacoes.component.html',
  styleUrl: './historico-transacoes.component.sass'
})
export class HistoricoTransacoesComponent {

  constructor(protected usuario:UsuarioService){}

  carteiraIndex:number = 1
}
