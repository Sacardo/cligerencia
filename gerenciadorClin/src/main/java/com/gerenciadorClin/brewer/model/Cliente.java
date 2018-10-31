package com.gerenciadorClin.brewer.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Cliente {

	private String idcliente;
	
	@NotBlank(message ="Nome é obrigatório")
	private String nome;
	@NotNull(message ="Nome é obrigatório")
	private int numProntuario;
	@NotNull(message ="Nome é obrigatório")
	private String nunCIC;
	@NotNull(message ="Nome é obrigatório")
	private String CPF;
	@NotBlank(message ="Nome é obrigatório")
	private String nomMae;
	@NotBlank(message ="Nome é obrigatório")
	private String nomPai;
	
	public Cliente() {
		
	}
	
	public Cliente(String idcliente, String nome, String nunCIC, String CPF, String nomMae, String nomPai) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.nunCIC = nunCIC;
		this.CPF = CPF;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
	}
	
	public String getNomMae() {
		return nomMae;
	}

	public void setNomMae(String nomMae) {
		this.nomMae = nomMae;
	}
	
	public String getNomPai() {
		return nomPai;
	}

	public void setNomPai(String nomPai) {
		this.nomPai = nomPai;
	}

	
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNunCIC() {
		return nunCIC;
	}

	public void setNunCIC(String nunCIC) {
		this.nunCIC = nunCIC;
	}

	public int getNumProntuario() {
		return numProntuario;
	}

	public void setNumProntuario(int numProntuario) {
		this.numProntuario = numProntuario;
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
