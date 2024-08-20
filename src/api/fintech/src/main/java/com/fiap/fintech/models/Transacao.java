package com.fiap.fintech.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@SQLDelete(sql = "UPDATE Transacao SET status = 'INATIVO' WHERE id = ?")
@SQLRestriction("status <> 'INATIVO'")
public class Transacao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  @Length(max = 100)
  @Column(nullable = false, length = 100)
  private String nome;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String categoria;

  @NotBlank
  @Column(nullable = false)
  private Long idCarteira;

  @NotBlank
  @Column(nullable = false)
  private Double saldo;

  @NotBlank
  @Length(max = 50)
  @Column(nullable = false, length = 50)
  private String tipo;

  @NotBlank
  @Column(nullable = false)
  private Date dtCriadoEm;

  @Column
  private Date dtAlteradoEm;

  @Column
  private Date dtDeletadoEm;

  @NotNull
  @Length(max = 10)
  @Pattern(regexp = "ATIVO|INATIVO")
  @Column(name = "status", nullable = false, length = 10)
  private String status = "ATIVO";


  public Transacao(){}
  public Transacao(String nome, String categoria, Long idCarteira, Double saldo, String tipo, Date dtCriadoEm) {
    this.nome = nome;
    this.categoria = categoria;
    this.idCarteira = idCarteira;
    this.saldo = saldo;
    this.tipo = tipo;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
