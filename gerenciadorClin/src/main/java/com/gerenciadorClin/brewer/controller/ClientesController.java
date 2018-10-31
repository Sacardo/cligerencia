package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Cliente;

@Controller
public class ClientesController {

	@RequestMapping("/clientes/novo")
	public String novo(Model model) {
		model.addAttribute(new Cliente());
		return "cliente/cadastroClientes";
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastro(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "cliente/cadastroClientes";
		}
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getNumProntuario());
		System.out.println(cliente.getNunCIC());
		System.out.println(cliente.getCPF());
		System.out.println(cliente.getNomMae());
		System.out.println(cliente.getNomPai());
		return "redirect:/clientes/novo";
		
	}
}
