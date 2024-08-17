package com.fiap.fintech.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, length = 150)
  private String nome;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false, length = 15)
  private String senha;

  @Column(nullable = false)
  private Double saldo;

  @Column(nullable = false)
  private Date dtCriadoEm;

  @Column
  private Date dtAlteradoEm;

  @Column
  private Date dtDeletadoEm;

  public Usuario(){}
  public Usuario(String nome, String email, String senha, Double saldo) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.saldo = saldo;
    this.dtCriadoEm = new Date();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public Date getDtCriadoEm() {
    return dtCriadoEm;
  }

  public void setDtCriadoEm(Date dtCriadoEm) {
    this.dtCriadoEm = dtCriadoEm;
  }

  public Date getDtAlteradoEm() {
    return dtAlteradoEm;
  }

  public void setDtAlteradoEm(Date dtAlteradoEm) {
    this.dtAlteradoEm = dtAlteradoEm;
  }

  public Date getDtDeletadoEm() {
    return dtDeletadoEm;
  }

  public void setDtDeletadoEm(Date dtDeletadoEm) {
    this.dtDeletadoEm = dtDeletadoEm;
  }

}
