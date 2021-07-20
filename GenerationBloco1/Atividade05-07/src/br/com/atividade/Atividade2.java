package br.com.atividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int i, somaPar = 0, somaIm = 0, arrey[];
		arrey = new int [11];
		
		Scanner entrada = new Scanner(System.in);
		
		for(i = 1; i <= 10; i++) {
			
			System.out.println("Digite um número");
			arrey[i] = entrada.nextInt();
			
			if(arrey[i] % 2 == 0) {
				somaPar++;
			}
			else {
				somaIm++;
			}
			
		}
		System.out.println("Total de números par: " + somaPar);
		System.out.println("Total de números impar: " + somaIm);

	}

}
 