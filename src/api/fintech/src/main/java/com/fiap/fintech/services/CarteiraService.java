package com.fiap.fintech.services;

import com.fiap.fintech.exceptions.RecordNotFoundException;
import com.fiap.fintech.models.Carteira;
import com.fiap.fintech.repositories.CarteiraRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarteiraService {

  private final CarteiraRepository carteiraRepository;

  public CarteiraService(CarteiraRepository carteiraRepository){
    this.carteiraRepository = carteiraRepository;
  }

  public List<Carteira> list(){
    return carteiraRepository.findAll();
  }

  public Carteira findById(@NotNull @Positive Long id){
    return carteiraRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public Carteira create(Carteira carteira){
    return carteiraRepository.save(carteira);
  }

  public Carteira update(@NotNull @Positive Long id, @Valid @NotNull Carteira carteira){
    return carteiraRepository.findById(id).map(recordFound -> {
      recordFound.setNome(carteira.getNome());
      recordFound.setObjetivo(carteira.getObjetivo());
      recordFound.setTipo(carteira.getTipo());
      recordFound.setBandeira(carteira.getBandeira());
      recordFound.setDtAlteradoEm(new Date());
      return carteiraRepository.save(recordFound);
      }).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public void delete(@NotNull @Positive Long id){
    carteiraRepository.findById(id).map(recordFound -> {
      recordFound.setDtDeletadoEm(new Date());
      carteiraRepository.save(recordFound);
      carteiraRepository.deleteById(id);
      return recordFound;
    }).orElseThrow(() -> new RecordNotFoundException(id));
  }
}
