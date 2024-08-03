import { Component, ElementRef, viewChild, ViewChild } from '@angular/core';
import { ControleModalService } from '../../shared/servicos/controle-modal.service';
import { UsuarioService } from '../../shared/servicos/usuario.service';
import { FormsModule } from '@angular/forms';
import { Transacao } from '../../shared/interfaces/transacao';

@Component({
  selector: 'app-criar-transacao',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './criar-transacao.component.html',
  styleUrl: './criar-transacao.component.sass'
})
export class CriarTransacaoComponent {

  constructor(protected modal: ControleModalService, protected usuario: UsuarioService) { }

  @ViewChild('nomeTransacao') nomeTransacao!: ElementRef
  @ViewChild('categoriaTransacao') categoriaTransacao!: ElementRef
  @ViewChild('dataTransacao') dataTransacao!: ElementRef
  @ViewChild('valorTransacao') valorTransacao!: ElementRef
  @ViewChild('despesaTransacao') despesaTransacao!: ElementRef
  @ViewChild('receitaTransacao') receitaTransacao!: ElementRef



  enviarTransacao(e: Event) {
    e.preventDefault()

    let transacao: Transacao = {
      nome: this.nomeTransacao.nativeElement.value,
      categoria: this.categoriaTransacao.nativeElement.value,
      data: this.dataTransacao.nativeElement.value,
      valor: this.valorTransacao.nativeElement.value,
      ehDespesa: false,
      ehReceita: false,
    }

    this.usuario.adicionarTransacao(transacao)

    console.log(this.usuario.info.transacoes)

    this.modal.abrirCriarTransacao()
  }
}
