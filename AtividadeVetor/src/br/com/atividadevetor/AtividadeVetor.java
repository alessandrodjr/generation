package br.com.atividadevetor;
import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double[] notas = new double [4];
		double soma = 0.0, media = 0.0; 
		
		int i; 
		
		System.out.println("Digite as 4 notas do Aluno: ");
		for (i = 0; i <= 3; i++) {
			notas[i] = entrada.nextDouble(); 
		}
		for (i = 0; i <= 3; i++) {
			soma = soma + notas[i]; // Pegando os valores dos vetores e somando. 
			media = soma / notas.length; // ou seja dividido pelo total de valores 
		}
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média das ntoras é: " + media);
	}
}
