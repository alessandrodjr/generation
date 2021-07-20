package br.com.atividade;

import br.com.polimorfismo.Cachorro;
import br.com.polimorfismo.Cavalo;
import br.com.polimorfismo.Preguica;

public class Atividade1 {

	public static void main(String[] args) {

		Cachorro dog1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica preg1 = new Preguica();
		
		dog1.setNome("Emma");
		dog1.setIdade(1);
		System.out.println("Cachorro");
		System.out.println("Nome: " + dog1.getNome());
		System.out.println("Idade: " + dog1.getIdade());
		dog1.emitirSom();
		dog1.correr();
		
		System.out.println("\n");
		
		cav1.setNome("Jucelino");
		cav1.setIdade(2);
		System.out.println("Cavalo");
		System.out.println("Nome: " + cav1.getNome());
		System.out.println("Idade: " + cav1.getIdade());
		cav1.emitirSom();
		cav1.correr();
		
		System.out.println("\n");
		
		preg1.setNome("Jurema");
		preg1.setIdade(3);
		System.out.println("Preguiça");
		System.out.println("Nome: " + preg1.getNome());
		System.out.println("Idade: " + preg1.getIdade());
		preg1.emitirSom();
		preg1.subirArvore();
		
		
		

	}

}
