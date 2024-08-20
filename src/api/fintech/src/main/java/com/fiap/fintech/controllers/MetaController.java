package com.fiap.fintech.controllers;

import com.fiap.fintech.models.Meta;
import com.fiap.fintech.services.MetaService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metas")
public class MetaController {

  private final MetaService metaService;

  public MetaController(MetaService metaService){
    this.metaService = metaService;
  }

  @GetMapping
  public List<Meta> list(){
    return metaService.list();
  }

  @GetMapping("/{id}")
  public Meta findById(@PathVariable @NotNull @Positive Long id){
    return metaService.findById(id);
  }

  @PostMapping
  public Meta create(@RequestBody Meta meta){
    return metaService.create(meta);
  }

  @PutMapping("/{id}")
  public Meta update(@PathVariable @NotNull @Positive Long id, @RequestBody Meta meta){
    return metaService.update(id, meta);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable @NotNull @Positive Long id){
    metaService.delete(id);
  }
}
