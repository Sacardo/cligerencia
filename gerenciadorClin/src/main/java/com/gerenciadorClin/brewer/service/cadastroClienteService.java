package com.gerenciadorClin.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.Clientes;

@Service
public class cadastroClienteService {
	
	@Autowired
	private Clientes clientes;
	

	public void salvar(Cliente cliente){
		clientes.save(cliente);
	}
	

}
