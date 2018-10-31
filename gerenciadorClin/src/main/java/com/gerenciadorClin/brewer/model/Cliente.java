package com.gerenciadorClin.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	private String idcliente;
	@NotBlank
	private String nome;
	
	
	public Cliente(String idcliente, String nome) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
	}
	
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
