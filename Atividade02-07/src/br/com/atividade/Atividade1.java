package br.com.atividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int n1, n2, n3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite um n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite um n�mero: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Primeiro n�mero maior");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("Segundo n�mero maior");
		}
		else {
			System.out.println("Terceiro n�mero maior");
		}

	}

}
