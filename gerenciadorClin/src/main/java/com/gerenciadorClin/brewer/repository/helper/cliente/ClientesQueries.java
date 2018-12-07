package com.gerenciadorClin.brewer.repository.helper.cliente;

import java.util.List;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.filter.ClienteFilter;

public interface ClientesQueries {
	
	public List<Cliente> filtrar(ClienteFilter filtro);

}
