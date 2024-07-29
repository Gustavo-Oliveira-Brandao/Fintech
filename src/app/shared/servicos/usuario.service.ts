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
      {
        nome: 'Netflix',
        categoria: 'Streaming',
        valor: 30.00,
        ehDespesa: true
      },
      {
        nome: 'Salario',
        categoria: 'Salario',
        valor: 3500.00,
        ehDespesa: false
      }
    ],
    metas: [],
    carteiras: []
  }
}
