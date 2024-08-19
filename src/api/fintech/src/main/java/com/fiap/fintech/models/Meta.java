package com.fiap.fintech.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@SQLDelete(sql = "UPDATE Meta SET status = 'INATIVO' WHERE id = ?")
public class Meta {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  @NotNull
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String nome;

  @NotBlank
  @NotNull
  @Column(nullable = false)
  private Double valorAtual;

  @NotBlank
  @NotNull
  @Column(nullable = false)
  private Double valorMeta;

  @NotBlank
  @NotNull
  @Column(nullable = false)
  private Date dtCriadoEm;

  @Column
  private Date dtAlteradoEm;

  @Column
  private Date dtDeletadoEm;

  @NotNull
  @Length(max = 10)
  @Pattern(regexp = "ATIVO|INATIVO")
  @Column(nullable = false, length = 10)
  private String status = "ATIVO";


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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
