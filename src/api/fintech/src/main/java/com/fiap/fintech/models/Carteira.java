package com.fiap.fintech.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.processing.SQL;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@SQLDelete(sql = "UPDATE Carteira SET status = 'INATIVO' WHERE id = ?")
public class Carteira {

  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  private Long id;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String nome;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String objetivo;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String tipo;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String bandeira;

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

  public Carteira(){}
  public Carteira(String nome, String objetivo, String tipo, String bandeira, Date dtCriadoEm) {
    this.nome = nome;
    this.objetivo = objetivo;
    this.tipo = tipo;
    this.bandeira = bandeira;
    this.dtCriadoEm = dtCriadoEm;
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

  public String getObjetivo() {
    return objetivo;
  }

  public void setObjetivo(String objetivo) {
    this.objetivo = objetivo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getBandeira() {
    return bandeira;
  }

  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
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
