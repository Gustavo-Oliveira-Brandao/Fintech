package com.fiap.fintech.services;

import com.fiap.fintech.exceptions.RecordNotFoundException;
import com.fiap.fintech.models.Meta;
import com.fiap.fintech.repositories.MetaRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MetaService {

  private final MetaRepository metaRepository;

  public MetaService(MetaRepository metaRepository){
    this.metaRepository = metaRepository;
  }

  public List<Meta> list(){
    return metaRepository.findAll();
  }

  public Meta findById(@NotNull @Positive Long id){
    return metaRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public Meta create(@Valid @NotNull Meta meta){
    return metaRepository.save(meta);
  }

  public Meta update(@NotNull @Positive Long id, @Valid @NotNull Meta meta){
    return metaRepository.findById(id).map(recordFound -> {
      recordFound.setNome(meta.getNome());
      recordFound.setValorAtual(meta.getValorAtual());
      recordFound.setValorMeta(meta.getValorMeta());
      recordFound.setDtAlteradoEm(new Date());
      return metaRepository.save(recordFound);
    }).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public void delete(@NotNull @Positive Long id){
    metaRepository.delete(metaRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id)));
  }
}
