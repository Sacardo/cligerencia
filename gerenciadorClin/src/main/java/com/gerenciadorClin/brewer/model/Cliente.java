package com.gerenciadorClin.brewer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {

	public Cliente(String nome,String numProntuario, String nunCIC, String CPF, String nomMae, String nomPai ) {
		this.nome = nome;
		this.numProntuario = numProntuario;
		this.nunCIC = nunCIC;
		this.CPF = CPF;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
	}
	

	public Cliente() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne
	@JoinColumn(name ="id_endereco")
	private Endereco endereco;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcliente == null) ? 0 : idcliente.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idcliente == null) {
			if (other.idcliente != null)
				return false;
		} else if (!idcliente.equals(other.idcliente))
			return false;
		return true;
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
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
