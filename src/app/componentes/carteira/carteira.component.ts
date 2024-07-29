import { Component, Input } from '@angular/core';
import { UsuarioService } from '../../shared/servicos/usuario.service';

@Component({
  selector: 'app-carteira',
  standalone: true,
  imports: [],
  templateUrl: './carteira.component.html',
  styleUrl: './carteira.component.sass'
})
export class CarteiraComponent {

  constructor(protected usuario:UsuarioService){}


}
