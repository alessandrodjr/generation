package br.com.atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		double numero, raiz, elevado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("A raiz quadrada de " + numero + " é "+ raiz);
		}
		else {
			elevado = Math.pow(numero, 2);
			System.out.println("O número " + numero + " elevado ao quadrado é "+ elevado);
		}

	}

}
