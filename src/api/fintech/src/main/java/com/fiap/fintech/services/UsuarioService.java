package com.fiap.fintech.services;

import com.fiap.fintech.repositories.UsuarioRepository;

public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public UsuarioService(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
  }


}
