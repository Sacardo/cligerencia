package com.gerenciadorClin.brewer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda {
	
private Long idAgenda ;
private Date data;
private Cliente cliente;
private String diaSemana;
private Date hora;


public Long getIdAgenda() {
	return idAgenda;
}
public void setIdAgenda(Long idAgenda) {
	this.idAgenda = idAgenda;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public String getDiaSemana() {
	return diaSemana;
}
public void setDiaSemana(String diaSemana) {
	this.diaSemana = diaSemana;
}
public Date getHora() {
	return hora;
}
public void setHora(Date hora) {
	this.hora = hora;
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAgenda == null) ? 0 : idAgenda.hashCode());
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
		Agenda other = (Agenda) obj;
		if (idAgenda == null) {
			if (other.idAgenda != null)
				return false;
		} else if (!idAgenda.equals(other.idAgenda))
			return false;
		return true;
}

}
