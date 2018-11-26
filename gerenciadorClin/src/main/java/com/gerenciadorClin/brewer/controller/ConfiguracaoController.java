package com.gerenciadorClin.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerenciadorClin.brewer.model.Agenda;


@Controller
public class ConfiguracaoController {
	
	
	/*	@Autowired
	private Configuracao configuracao;*/
	
	@RequestMapping("/configuracao/novo")	
	public String novo(Agenda agenda) {
		return "configuracao/configuracaoAgenda";
	}
	
/*	@RequestMapping(value = "/agenda/agendaClientes", method = RequestMethod.POST)
	public String cadastro(@Valid Agenda agenda, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return pesquisar(agenda);
		}
		attributes.addFlashAttribute("mensagem","Cliente salvo com sucesso!");
		return "redirect:/agenda/agendaClientes";
	}*/
	
	@RequestMapping("/configuracao/ConfiguracaoAgenda")
	public String cadastro(){
		return "configuracao/configuracaoAgenda";
	}

}
