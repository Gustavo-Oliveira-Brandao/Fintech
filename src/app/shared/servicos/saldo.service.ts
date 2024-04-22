import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SaldoService {

  constructor() { }

  saldo: any = {
    id: 0,
    valor: 0,
  }

  gastoMensal: any = {
    id: 0,
    valor: 0,
  }
}
