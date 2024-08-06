import { Component, ElementRef, viewChild, ViewChild } from '@angular/core';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { FormsModule } from '@angular/forms';
import { Transacao } from '../../shared/interfaces/transacao';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-criar-transacao',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './criar-transacao.component.html',
  styleUrl: './criar-transacao.component.sass'
})
export class CriarTransacaoComponent {

  constructor(protected modal: ControleModalService, protected usuario: UsuarioService) { }

  tiposTransacao = ['Despesa', 'Receita']

  transacao:Transacao = {
    nome: '',
    categoria: '',
    data: '',
    valor: 0,
    tipo: ''
  }

  enviarTransacao(e: Event) {
    e.preventDefault()

    this.usuario.adicionarTransacao(this.transacao)
    this.modal.abrirCriarTransacao()
  }

}
