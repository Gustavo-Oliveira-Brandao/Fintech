import { Component } from '@angular/core';
import { UsuarioService } from '../../shared/servicos/usuario.service';

@Component({
  selector: 'app-saldo',
  standalone: true,
  imports: [],
  templateUrl: './saldo.component.html',
  styleUrl: './saldo.component.sass'
})
export class SaldoComponent {

  constructor(protected usuario:UsuarioService){}

}
