package br.com.atividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int i;
		double[] nota = new double [5];
		double maiorNota = 0.0;
		
		System.out.println("Digite as notas: ");
		for(i = 0; i < nota.length; i++) {
			
			nota[i] = ler.nextDouble();
		}
		for(i = 0; i < nota.length; i++) {
			
			System.out.println(i + 1 +"º Nota: " + nota[i]);
			
			if(nota[i] > maiorNota) {
				maiorNota = nota[i];
			}
			
		}
		System.out.println("Maior nota é: " + maiorNota);

	}

}
