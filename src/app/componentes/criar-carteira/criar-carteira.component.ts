import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { Carteira } from '../../shared/interfaces/carteira';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { NgFor, NgForOf, NgIf } from '@angular/common';
import { UsuarioService } from '../../shared/servicos/usuario.service';

@Component({
  selector: 'app-criar-carteira',
  standalone: true,
  imports: [FormsModule, NgFor, NgIf, NgForOf, ReactiveFormsModule],
  templateUrl: './criar-carteira.component.html',
  styleUrl: './criar-carteira.component.sass'
})
export class CriarCarteiraComponent implements OnInit {

  constructor(protected usuario: UsuarioService, protected modal: ControleModalService) { }

  ngOnInit(): void {
    this.carteiraForm = new FormGroup({
      objetivo: new FormControl('', [Validators.required]),
      tipo: new FormControl('', [Validators.required]),
      bandeira: new FormControl('', [Validators.required])
    })
  }

  get objetivo() {
    return this.carteiraForm.get('objetivo')!
  }
  get tipo() {
    return this.carteiraForm.get('tipo')!
  }
  get bandeira() {
    return this.carteiraForm.get('bandeira')!
  }

  carteiraForm !: FormGroup

  bandeiras = ['Visa', 'Mastercard']

  tipos = ['Dinheiro', 'Cartão de crédito', 'Cartão de débito']

  enviarCarteira(e: SubmitEvent) {
    e.preventDefault()

    if (this.carteiraForm.value.tipo == 'Dinheiro') {
      this.carteiraForm.get('bandeira')?.clearValidators()
      this.carteiraForm.get('bandeira')?.updateValueAndValidity()
      this.carteiraForm.value.bandeira = 'Dinheiro'
    }

    if (this.carteiraForm.invalid) {
      return
    }

    console.log(this.carteiraForm.value)
    this.usuario.criarCarteira(this.carteiraForm.value)

    this.modal.abrirCriarCarteira()

  }
}
