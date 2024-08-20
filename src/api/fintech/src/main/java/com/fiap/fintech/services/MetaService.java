package com.fiap.fintech.services;

import com.fiap.fintech.repositories.MetaRepository;
import org.springframework.stereotype.Service;

@Service
public class MetaService {

  private final MetaRepository metaRepository;

  public MetaService(MetaRepository metaRepository){
    this.metaRepository = metaRepository;
  }
}
