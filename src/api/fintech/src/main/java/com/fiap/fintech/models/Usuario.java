package com.fiap.fintech.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@SQLDelete(sql = "UPDATE Usuario SET status = 'INATIVO' WHERE id = ?")
@SQLRestriction("status <> 'INATIVO'")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  @NotNull
  @Length(max = 150)
  @Column(nullable = false, length = 150)
  private String nome;

  @NotBlank
  @NotNull
  @Column(nullable = false)
  private String email;

  @NotBlank
  @NotNull
  @Length(max = 15)
  @Column(nullable = false, length = 15)
  private String senha;

  @NotNull
  @Column(nullable = false)
  private Double saldo;

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

  public Usuario(){}
  public Usuario(String nome, String email, String senha, Double saldo, Date dtCriadoEm) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.saldo = saldo;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
