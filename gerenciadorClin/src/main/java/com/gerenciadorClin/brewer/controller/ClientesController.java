package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.Clientes;
import com.gerenciadorClin.brewer.repository.filter.ClienteFilter;
import com.gerenciadorClin.brewer.service.cadastroClienteService;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
	

   @Autowired
   private cadastroClienteService clienteService;
   
   @Autowired
   private Clientes clientes;
	

	@RequestMapping("/novo")	
	public ModelAndView novo(Cliente cliente) {
		ModelAndView vw = new ModelAndView("cliente/cadastrarClientes");
		return vw;
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cliente);
		}
		clienteService.salvar(cliente);
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return new ModelAndView ("redirect:/clientes/novo");
	}
		
	@GetMapping()
	public ModelAndView pesquisar(ClienteFilter clienteFIlter, BindingResult result){
		ModelAndView mv = new ModelAndView("cliente/pesquisarClientes");
		mv.addObject("clientes", clientes.filtrar(clienteFIlter));
		return mv;
	}


}
