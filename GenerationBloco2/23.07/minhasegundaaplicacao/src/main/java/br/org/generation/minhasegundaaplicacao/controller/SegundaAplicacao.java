package br.org.generation.minhasegundaaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segunda")
public class SegundaAplicacao {
	
	@GetMapping
	public String segunda() {
		return "O objetivo dessa semana é aprender spring boot e praticar "
				+ "ao máximo para consolidar o matéria.";
	}

}
