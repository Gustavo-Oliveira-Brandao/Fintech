package com.fiap.fintech.services;

import com.fiap.fintech.exceptions.RecordNotFoundException;
import com.fiap.fintech.models.Transacao;
import com.fiap.fintech.repositories.TransacaoRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransacaoService {

  private final TransacaoRepository transacaoRepository;

  public TransacaoService(TransacaoRepository transacaoRepository){
    this.transacaoRepository = transacaoRepository;
  }

  public List<Transacao> list(){
    return transacaoRepository.findAll();
  }

  public Transacao findById(@NotNull @Positive Long id){
    return transacaoRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public Transacao create(@Valid @NotNull Transacao transacao){
    return transacaoRepository.save(transacao);
  }

  public Transacao update(@NotNull @Positive Long id, @Valid @NotNull Transacao transacao){
    return transacaoRepository.findById(id).map(recordFound -> {
      recordFound.setNome(transacao.getNome());
      recordFound.setSaldo(transacao.getSaldo());
      recordFound.setCategoria(transacao.getCategoria());
      recordFound.setTipo(transacao.getTipo());
      recordFound.setDtAlteradoEm(new Date());
      return transacaoRepository.save(recordFound);
    }).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public void delete(@NotNull @Positive Long id){
    transacaoRepository.delete(transacaoRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id)));
  }
}
