package br.com.atividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int n1, n2, n3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite um número: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite um número: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Primeiro número maior");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("Segundo número maior");
		}
		else {
			System.out.println("Terceiro número maior");
		}

	}

}
