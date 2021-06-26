package com.crudbasico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome", length = 100)
	@NotNull
	@Min(value = 3)
	@Max(value = 100)
	private String nome;
	
	@Column(name = "cpf")
	@NotNull
	private Integer cpf;
	
	@Column(name = "endereco")
	private Endereco endereco;
	
	@Column(name = "tel_residencial")
	private Integer telefoneResidencial;
	
	@Column(name = "tel_comercial")
	private Integer telefoneComercial;
	
	@Column(name = "tel_celular")
	@NotNull
	private Integer telefoneCelular;
	
	@Column(name = "email")
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Integer getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(Integer telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public Integer getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(Integer telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	public Integer getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(Integer telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
