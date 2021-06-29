package com.crudbasico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "endereco")
	private Cliente cliente;

	@Column(name = "cep")
	private Integer cep;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "uf")
	private String uf;

	@Column(name = "complemento")
	private String complemento;

	public Endereco(Integer cep, String logradouro, String cidade, String bairro, String uf, String complemento) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
		this.complemento = complemento;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
