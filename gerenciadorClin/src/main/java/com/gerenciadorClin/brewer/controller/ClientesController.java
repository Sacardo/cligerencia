package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.Clientes;

@Controller
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/clientes/novo")	
	public String novo(Cliente cliente) {
	clientes.findAll();
		return "cliente/cadastroClientes";
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastro(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cliente);
		}
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return "redirect:/clientes/novo";
	}
	
	@RequestMapping("/clientes/cadastro")
	public String cadastro(){
		return "cliente/cadastro-produto";
	}
}
