import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ControleModalService {

  constructor() { }

  criarTransacaoEstaAberto:boolean = false
  criarCarteiraEstaAberto:boolean = false

  abrirCriarTransacao(){
    if(!this.criarTransacaoEstaAberto){
      document.getElementById('historico-transacoes')?.classList.add('blur')
    }
    else{
      document.getElementById('historico-transacoes')?.classList.remove('blur')
    }
    this.criarTransacaoEstaAberto = !this.criarTransacaoEstaAberto
  }

  abrirCriarCarteira(){
    if(!this.criarCarteiraEstaAberto){
      document.getElementById('historico-transacoes')?.classList.add('blur')
    }
    else{
      document.getElementById('historico-transacoes')?.classList.remove('blur')
    }
    this.criarCarteiraEstaAberto = !this.criarCarteiraEstaAberto
  }

}
