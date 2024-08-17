package com.fiap.fintech.services;

import com.fiap.fintech.repositories.CarteiraRepository;

public class CarteiraService {

  private final CarteiraRepository carteiraRepository;

  public CarteiraService(CarteiraRepository carteiraRepository){
    this.carteiraRepository = carteiraRepository;
  }
}
