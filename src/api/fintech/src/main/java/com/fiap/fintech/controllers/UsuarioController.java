package com.fiap.fintech.controllers;

import com.fiap.fintech.models.Usuario;
import com.fiap.fintech.repositories.UsuarioRepository;
import com.fiap.fintech.services.UsuarioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


  private final UsuarioService usuarioService;
  public UsuarioController(UsuarioService usuarioService){
    this.usuarioService = usuarioService;
  }

  @GetMapping("/{id}")
  public Usuario findById(@PathVariable @NotNull @Positive Long id){
    return usuarioService.findById(id);
  }

  @GetMapping
  public List<Usuario> list(){
    return usuarioService.list();
  }

  @PostMapping
  public Usuario create(@RequestBody Usuario usuario){
    return usuarioService.create(usuario);
  }

  @PutMapping("/{id}")
  public Usuario update(@PathVariable @NotNull @Positive Long id ,@RequestBody @Valid @NotNull Usuario usuario){
    return usuarioService.update(id, usuario);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable @NotNull @Positive Long id){
    usuarioService.delete(id);
  }

}
