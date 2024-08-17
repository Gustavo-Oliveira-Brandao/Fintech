package com.fiap.fintech.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Meta {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private Double valorAtual;

  @Column(nullable = false)
  private Double valorMeta;

  @Column(nullable = false)
  private Date dtCriadoEm;

  @Column
  private Date dtAlteradoEm;

  @Column
  private Date dtDeletadoEm;

  public Meta(String nome, Double valorAtual, Double valorMeta) {
    this.nome = nome;
    this.valorAtual = valorAtual;
    this.valorMeta = valorMeta;
    this.dtCriadoEm = new Date();
  }

  public Meta(){}

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

  public Double getValorAtual() {
    return valorAtual;
  }

  public void setValorAtual(Double valorAtual) {
    this.valorAtual = valorAtual;
  }

  public Double getValorMeta() {
    return valorMeta;
  }

  public void setValorMeta(Double valorMeta) {
    this.valorMeta = valorMeta;
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
