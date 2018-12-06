package com.gerenciadorClin.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadorClin.brewer.model.Funcionario;

@Controller
public class FuncionariosController {
	

  /* @Autowired
   private cadastroFuncionarioService funcionarioService; */
	

	@RequestMapping("/funcionarios/novo")	
	public ModelAndView novo(Funcionario funcionario) {
		ModelAndView vw = new ModelAndView("funcionario/cadastroFuncionario");
		return vw;
	}
	
	@RequestMapping(value = "/funcionarios/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Funcionario funcionarios, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(funcionarios);
		}
		//funcionarioService.salvar(funcionarios);
		attributes.addFlashAttribute("mensagem","Funcionarios salvo com sucesso!");
		return new ModelAndView ("redirect:/Funcionarios/novo");
	}
	
	private ModelAndView ModelAndView(String string) {
		return null;
	}


}
