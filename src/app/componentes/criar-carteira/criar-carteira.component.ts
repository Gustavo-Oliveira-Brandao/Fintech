import { Component, ElementRef, ViewChild } from '@angular/core';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { Carteira } from '../../shared/interfaces/carteira';
import { FormsModule } from '@angular/forms';
import { NgFor, NgForOf } from '@angular/common';
import { UsuarioService } from '../../shared/servicos/usuario.service';

@Component({
  selector: 'app-criar-carteira',
  standalone: true,
  imports: [FormsModule, NgFor, NgForOf],
  templateUrl: './criar-carteira.component.html',
  styleUrl: './criar-carteira.component.sass'
})
export class CriarCarteiraComponent {

  constructor(protected usuario:UsuarioService, protected modal:ControleModalService){}

  carteira:Carteira = {
    objetivo: '',
    tipo: '',
    bandeira: '',
    valor: 0
  }

  bandeiras = ['Visa', 'Mastercard']

  tipos = ['Dinheiro', 'Cartão de crédito', 'Cartão de débito']

  enviarCarteira(e:SubmitEvent){
    e.preventDefault()

    this.usuario.criarCarteira(this.carteira)
    this.modal.abrirCriarCarteira()

  }
}
