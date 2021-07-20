package br.com.atividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int i;
		double[] valor = new double [10];
		double maiorValor = 0.0, media = 0.0;
		
		System.out.println("Digite 10 valores: ");
		
		for(i = 0; i < valor.length; i++) {
			
			valor[i] = ler.nextDouble();
			
			media += valor[i];
			
			if(valor[i] > maiorValor) {
				maiorValor = valor[i];
			}
		}
		
		media = media/valor.length;
		System.out.println("A média é: : " + media);
		System.out.println("Maior valor é: " + maiorValor);

	}

}