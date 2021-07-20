package br.com.atividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite um número: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite um número: ");
		n3 = entrada.nextInt();
		
		if(n1 < n2 && n1 < n3) {
			System.out.println(n1);
			
			if(n2 < n3){
				System.out.println(n2);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n2);
			}
		}
		else if (n2 < n1 && n2 < n3) {
			System.out.println(n2);
			
			if(n1 < n3){
				System.out.println(n1);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n1);
			}}
		else {
			System.out.println(n3);
			if(n2 < n1){
				System.out.println(n2);
				System.out.println(n1);
			} else {
				System.out.println(n1);
				System.out.println(n2);
		}

	}
}}
