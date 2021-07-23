package br.org.generation.minhaprimeiraaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira")
public class MinhaPrimeiraAplicacao {
	
	@GetMapping
	public String primeira() {
		return "Para a realização dessa atividade foi utilizado \n"
				+ "\nMentalidade: persistencia e \n"
				+ "\nHabilidade: Atenção aos detalhes";
	}

}
