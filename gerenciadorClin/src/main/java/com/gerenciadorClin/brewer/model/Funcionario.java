package com.gerenciadorClin.brewer.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
private String idcliente;
	
	@NotBlank(message ="É obrigatório o Nome")
	private String nome;
	
	@NotBlank(message ="É obrigatório Numero de Prontuario")
	private String numProntuario;
	
	@NotNull(message ="É obrigatório  RG")
	private String nunCIC;
	
	@NotNull(message ="É obrigatório CPF")
	private String CPF;
	
	@NotBlank(message ="É obrigatório Nome da Mãe")
	private String nomMae;
	
	@NotBlank(message ="É obrigatório Nome do Pai")
	private String nomPai;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome,String numProntuario, String nunCIC, String CPF, String nomMae, String nomPai ) {
		this.nome = nome;
		this.numProntuario = numProntuario;
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

	public String getNumProntuario() {
		return numProntuario;
	}

	public void setNumProntuario(String numProntuario) {
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
