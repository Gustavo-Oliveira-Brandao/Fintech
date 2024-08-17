package com.fiap.fintech.services;

import com.fiap.fintech.repositories.MetaRepository;

public class MetaService {

  private final MetaRepository metaRepository;

  public MetaService(MetaRepository metaRepository){
    this.metaRepository = metaRepository;
  }
}
