package com.fiap.fintech.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transacao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String categoria;

  @Column(nullable = false)
  private Long idCarteira;

  @Column(nullable = false)
  private Double saldo;

  @Column(nullable = false)
  private String tipo;

  @Column(nullable = false)
  private Date dtCriadoEm;

  @Column
  private Date dtAlteradoEm;

  @Column
  private Date dtDeletadoEm;

  public Transacao(){}
  public Transacao(String nome, String categoria, Long idCarteira, Double saldo, String tipo) {
    this.nome = nome;
    this.categoria = categoria;
    this.idCarteira = idCarteira;
    this.saldo = saldo;
    this.tipo = tipo;
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

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Long getIdCarteira() {
    return idCarteira;
  }

  public void setIdCarteira(Long idCarteira) {
    this.idCarteira = idCarteira;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
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
