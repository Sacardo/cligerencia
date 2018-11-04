package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Funcionario;

@Controller
public class FuncionariosController {

	@RequestMapping("/funcionario/novo")
	public String novo(Funcionario funcionario) {
		return "funcionario/cadastroFuncionarios";
	}
	
	@RequestMapping(value = "/funcionarios/novo", method = RequestMethod.POST)
	public String cadastro(@Valid Funcionario funcionario , BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(funcionario);
		}
		attributes.addFlashAttribute("mensagem","Funcionário salvo com sucesso!");
		return "redirect:/funcionario/novo";
	}
	
	@RequestMapping("/funcionario/cadastro")
	public String cadastro(){
		return "funcionario/cadastro-produto";
	}
}
