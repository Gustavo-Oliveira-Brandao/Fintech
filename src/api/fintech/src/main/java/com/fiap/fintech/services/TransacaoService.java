package com.fiap.fintech.services;

import com.fiap.fintech.repositories.TransacaoRepository;

public class TransacaoService {

  private final TransacaoRepository transacaoRepository;

  public TransacaoService(TransacaoRepository transacaoRepository){
    this.transacaoRepository = transacaoRepository;
  }
}
