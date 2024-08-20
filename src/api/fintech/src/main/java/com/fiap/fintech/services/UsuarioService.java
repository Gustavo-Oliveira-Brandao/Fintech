package com.fiap.fintech.services;

import com.fiap.fintech.exceptions.RecordNotFoundException;
import com.fiap.fintech.models.Usuario;
import com.fiap.fintech.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public UsuarioService(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
  }


  public List<Usuario> list(){
    return usuarioRepository.findAll();
  }

  public Usuario findById(@NotNull @Positive Long id){
    return usuarioRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public Usuario create(@Valid @NotNull Usuario usuario){
    return usuarioRepository.save(usuario);
  }

  public Usuario update(@NotNull @Positive Long id, @Valid @NotNull Usuario usuario){
    return usuarioRepository.findById(id).map(recordFound -> {
      recordFound.setNome(usuario.getNome());
      recordFound.setEmail(usuario.getEmail());
      recordFound.setSenha(usuario.getSenha());
      recordFound.setSaldo(usuario.getSaldo());
      recordFound.setDtAlteradoEm(new Date());
      return usuarioRepository.save(recordFound);
    }).orElseThrow(() -> new RecordNotFoundException(id));
  }

  public void delete(@NotNull @Positive Long id){
    usuarioRepository.delete(usuarioRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id)));
  }
}
