import { Component, Input } from '@angular/core';
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';

@Component({
  selector: 'app-carteira',
  standalone: true,
  imports: [],
  templateUrl: './carteira.component.html',
  styleUrl: './carteira.component.sass'
})
export class CarteiraComponent {

  constructor(protected usuario:UsuarioService, protected modal:ControleModalService){}


}
