package com.gerenciadorClin.brewer.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {
	
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idContato;

private String email;

private String telefone;

private String celular;

@OneToMany(mappedBy ="idContato")
private List<Cliente> cliente;

public long getIdContato() {
	return idContato;
}

public void setIdContato(long idContato) {
	this.idContato = idContato;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idContato == null) ? 0 : idContato.hashCode());
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
	Contato other = (Contato) obj;
	if (idContato == null) {
		if (other.idContato != null)
			return false;
	} else if (!idContato.equals(other.idContato))
		return false;
	return true;
}


}
