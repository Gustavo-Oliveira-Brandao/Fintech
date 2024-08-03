import { Injectable } from '@angular/core';

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
    transacoes: [
    ],
    metas: [],
    carteiras: []
  }

  datasTransacoesAgrupadas :any = []

  agruparTransacoes() {
    for (let transacao of this.info.transacoes) {
      if (!this.datasTransacoesAgrupadas.includes(transacao.data)) {
        const dataFormatada = new Date(transacao.data).toLocaleDateString('en')
        this.datasTransacoesAgrupadas.push(dataFormatada)
      }
    }
    this.datasTransacoesAgrupadas.sort(function(a:any, b:any){
      let c:any = new Date(a)
      let d:any = new Date(b)
      return d-c
    })
  }

  adicionarTransacao = (transacao:any) => {
    this.info.transacoes.push(transacao)
    console.log(this.info.transacoes)
  }

}
