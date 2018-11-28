package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.Clientes;

@Controller
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/clientes/pesquisar")	
	public ModelAndView pesquisar(Cliente cliente) {
		return ModelAndView("cliente/pesquisarClientes");
	}
	
	@RequestMapping("/clientes/novo")	
	public ModelAndView novo(Cliente cliente) {
		ModelAndView vw = new ModelAndView("cliente/cadastroClientes");
		vw.addObject("cliente",((JpaRepository<Cliente, Long>) cliente).findAll());
		return vw;
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public ModelAndView cadastro(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cliente);
		}
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return ModelAndView ("redirect:/clientes/novo");
	}
	
	private ModelAndView ModelAndView(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/clientes/cadastro")
	public String cadastro(){
		return "cliente/cadastro-produto";
	}
}
