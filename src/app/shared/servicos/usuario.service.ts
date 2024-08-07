import { Injectable } from '@angular/core';
import { Carteira } from '../interfaces/carteira';
import { Transacao } from '../interfaces/transacao';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor() { }

  Real = new Intl.NumberFormat('pt-BR', {
    style: 'currency',
    currency: 'BRL'
  })

  info: any = {
    nome: "Usuário",
    saldo: 0.00,
    transacoes: [],
    metas: [],
    carteiras: []
  }

  datasTransacoesAgrupadas: any = []

  agruparTransacoes() {
    for (let transacao of this.info.transacoes) {
      if (!this.datasTransacoesAgrupadas.includes(transacao.data)) {
        this.datasTransacoesAgrupadas.push(transacao.data)
      }
    }
    this.datasTransacoesAgrupadas.sort(function (a: any, b: any) {
      let c: any = new Date(a)
      let d: any = new Date(b)
      return d - c
    })
  }

  adicionarTransacao = (transacao: Transacao) => {
    this.info.transacoes.push(transacao)
    this.agruparTransacoes()

    console.log(transacao)
    for (let carteira of this.info.carteiras) {
      if (carteira.objetivo == transacao.carteira) {
        if (transacao.tipo == 'Receita') {
          carteira.valor += transacao.valor
        }
        if (transacao.tipo == 'Despesa') {
          carteira.valor -= transacao.valor
        }
      }
    }
  }

  criarCarteira = (carteira: Carteira) => {
    carteira.valor = 0
    this.info.carteiras.push(carteira)
  }

}
