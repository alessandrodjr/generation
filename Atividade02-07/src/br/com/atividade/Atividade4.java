package br.com.atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		double numero, raiz, elevado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("A raiz quadrada de " + numero + " � "+ raiz);
		}
		else {
			elevado = Math.pow(numero, 2);
			System.out.println("O n�mero " + numero + " elevado ao quadrado � "+ elevado);
		}

	}

}
