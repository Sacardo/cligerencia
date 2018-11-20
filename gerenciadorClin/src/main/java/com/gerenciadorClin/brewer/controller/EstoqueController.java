package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.model.Estoque;

@Controller
public class EstoqueController {
		
/*	@Autowired
	private Estoque estoque;*/
	
	@RequestMapping("/estoque/pesquisar")	
	public String pesquisar(Cliente cliente) {
		return "estoque/pesquisarEstoque";
	}
	
	@RequestMapping("/estoque/novo")	
	public String novo(Estoque estoque) {
		return "estoque/cadastroEstoque";
	}
	
	@RequestMapping(value = "/estoque/novo", method = RequestMethod.POST)
	public String cadastro(@Valid Estoque estoque, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(estoque);
		}
		attributes.addFlashAttribute("mensagem","Estoque salvo com sucesso!");
		return "redirect:/estoque/novo";
	}
	
	@RequestMapping("/estoque/cadastro")
	public String cadastro(){
		return "cliente/cadastro-produto";
	}
}
