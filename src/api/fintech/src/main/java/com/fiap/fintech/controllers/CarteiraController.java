package com.fiap.fintech.controllers;

import com.fiap.fintech.models.Carteira;
import com.fiap.fintech.repositories.CarteiraRepository;
import com.fiap.fintech.services.CarteiraService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carteiras")
public class CarteiraController {

  private final CarteiraService carteiraService;

  public CarteiraController(CarteiraService carteiraService){
    this.carteiraService = carteiraService;
  }

  @GetMapping
  public List<Carteira> list(){
    return carteiraService.list();
  }

  @GetMapping("/{id}")
  public Carteira findById(@PathVariable @NotNull @Positive Long id){
    return carteiraService.findById(id);
  }

  @PostMapping
  public Carteira create(@RequestBody Carteira carteira){
    return carteiraService.create(carteira);
  }

  @PutMapping("/{id}")
  public Carteira update(@PathVariable @NotNull @Positive Long id ,@RequestBody @Valid @NotNull Carteira carteira){
    return carteiraService.update(id, carteira);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable @NotNull @Positive Long id){
    carteiraService.delete(id);
  }
}
