package br.com.atividade;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n, media = 0, cont = 0;
	
	do {
		
		System.out.print("Digite um número: ");
		n = ler.nextInt();
		cont++;
		
		if(n % 3 == 0 && n != 0) {
			media += n;
		}
	}while(n != 0);
	
	media = media/cont;
	System.out.print("Média: " + media);
}}