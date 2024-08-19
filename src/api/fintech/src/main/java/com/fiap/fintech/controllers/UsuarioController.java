package com.fiap.fintech.controllers;

import com.fiap.fintech.models.Usuario;
import com.fiap.fintech.repositories.UsuarioRepository;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  private final UsuarioRepository usuarioRepository;

  public UsuarioController(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Usuario> findById(@PathVariable @NotNull @Positive Long id){
    return usuarioRepository.findById(id).map(recordFound -> ResponseEntity.ok().body(recordFound))
      .orElse(ResponseEntity.notFound().build());
  }

  @GetMapping
  public List<Usuario> list(){
    return usuarioRepository.findAll();
  }

  @PostMapping
  public Usuario create(@RequestBody Usuario usuario){
    return usuarioRepository.save(usuario);
  }

}
