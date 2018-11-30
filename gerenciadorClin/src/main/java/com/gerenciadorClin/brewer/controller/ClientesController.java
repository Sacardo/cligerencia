package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.service.cadastroClienteService;

@Controller
public class ClientesController {
	

   @Autowired
   private cadastroClienteService clienteService; 
	

	@RequestMapping("/clientes/novo")	
	public ModelAndView novo(Cliente cliente) {
		ModelAndView vw = new ModelAndView("cliente/cadastroClientes");
		return vw;
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cliente);
		}
		clienteService.salvar(cliente);
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return new ModelAndView ("redirect:/clientes/novo");
	}
	
	private ModelAndView ModelAndView(String string) {
		return null;
	}


}
