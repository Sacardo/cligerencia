package com.gerenciadorClin.brewer.model;

import java.io.Serializable;
import java.util.Date;

public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long idFuncionario;
	private String fnNome;
	private String fnCPF;
	private String fnCIC;
	private Date fnDtNascimento;
	private Date fnDtCadastro;
	
	
	public Long getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	public String getFnNome() {
		return fnNome;
	}

	public void setFnNome(String fnNome) {
		this.fnNome = fnNome;
	}
	
	public String getFnCPF() {
		return fnCPF;
	}
	
	public void setFnCPF(String fnCPF) {
		this.fnCPF = fnCPF;
	}
	
	public String getFnCIC() {
		return fnCIC;
	}
	
	public void setFnCIC(String fnCIC) {
		this.fnCIC = fnCIC;
	}
	
	public Date getFnDtNascimento() {
		return fnDtNascimento;
	}
	
	public void setFnDtNascimento(Date fnDtNascimento) {
		this.fnDtNascimento = fnDtNascimento;
	}
	
	public Date getFnDtCadastro() {
		return fnDtCadastro;
	}
	
	public void setFnDtCadastro(Date fnDtCadastro) {
		this.fnDtCadastro = fnDtCadastro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (idFuncionario == null) {
			if (other.idFuncionario != null)
				return false;
		} else if (!idFuncionario.equals(other.idFuncionario))
			return false;
		return true;
	}

	
	
}
