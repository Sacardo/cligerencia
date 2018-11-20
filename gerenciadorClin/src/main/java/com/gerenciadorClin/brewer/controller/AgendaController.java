package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Agenda;

@Controller
public class AgendaController {
	
/*	@Autowired
	private Agenda agenda;*/
	
	@RequestMapping("/agenda/novo")	
	public String novo(Agenda agenda) {
		return "agenda/agendaClientes";
	}
	
/*	@RequestMapping(value = "/agenda/agendaClientes", method = RequestMethod.POST)
	public String cadastro(@Valid Agenda agenda, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return pesquisar(agenda);
		}
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return "redirect:/agenda/agendaClientes";
	}*/
	
	@RequestMapping("/agenda/agendaClientes")
	public String cadastro(){
		return "agenda/agendaClientes";
	}
}
