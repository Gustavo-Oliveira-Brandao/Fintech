package com.fiap.fintech.controllers;

import com.fiap.fintech.models.Transacao;
import com.fiap.fintech.services.TransacaoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

  private final TransacaoService transacaoService;

  public TransacaoController(TransacaoService transacaoService){
    this.transacaoService = transacaoService;
  }

  @GetMapping
  public List<Transacao> list(){
    return transacaoService.list();
  }

  @GetMapping("/{id}")
  public Transacao findById(@PathVariable @NotNull @Positive Long id){
    return transacaoService.findById(id);
  }

  @PostMapping
  public Transacao create(@Valid @NotNull Transacao transacao){
    return transacaoService.create(transacao);
  }

  @PutMapping("/{id}")
  public Transacao update(@PathVariable @NotNull @Positive Long id, @Valid @NotNull Transacao transacao){
    return transacaoService.update(id, transacao);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable @NotNull @Positive Long id){
    transacaoService.delete(id);
  }
}
