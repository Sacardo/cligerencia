package com.gerenciadorClin.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerenciadorClin.brewer.model.Cliente;

@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	public String novo() {
		return "cliente/cadastroClientes";
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastro(Cliente cliente) {
		System.out.println(cliente.getNome() + " Tudo ok, até aqui");
		return "cliente/cadastroClientes";
	}

}
