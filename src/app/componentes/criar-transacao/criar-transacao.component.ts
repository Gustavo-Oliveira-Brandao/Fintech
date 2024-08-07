import { Component, OnInit } from '@angular/core';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Transacao } from '../../shared/interfaces/transacao';
import { NgFor, NgIf } from '@angular/common';

@Component({
  selector: 'app-criar-transacao',
  standalone: true,
  imports: [FormsModule, NgIf, NgFor, ReactiveFormsModule],
  templateUrl: './criar-transacao.component.html',
  styleUrl: './criar-transacao.component.sass'
})
export class CriarTransacaoComponent implements OnInit {

  ngOnInit(): void {
    this.transacaoForm = new FormGroup({
      nome: new FormControl('', [Validators.required]),
      categoria: new FormControl('', [Validators.required]),
      carteira: new FormControl('', [Validators.required]),
      data: new FormControl('', [Validators.required]),
      valor: new FormControl(0, [Validators.required]),
      tipo: new FormControl('', [Validators.required]),
    })
  }

  get nome() {
    return this.transacaoForm.get('nome')!
  }
  get categoria() {
    return this.transacaoForm.get('categoria')!
  }
  get carteira() {
    return this.transacaoForm.get('carteira')!
  }
  get data() {
    return this.transacaoForm.get('data')!
  }
  get valor() {
    return this.transacaoForm.get('valor')!
  }
  get tipo() {
    return this.transacaoForm.get('tipo')!
  }

  transacaoForm!: FormGroup

  constructor(protected modal: ControleModalService, protected usuario: UsuarioService) { }

  tiposTransacao = ['Despesa', 'Receita']

  enviarTransacao(e: Event) {
    e.preventDefault()

    if (this.transacaoForm.invalid) {
      return
    }

    this.usuario.adicionarTransacao(this.transacaoForm.value)

    this.modal.abrirCriarTransacao()
  }

}
