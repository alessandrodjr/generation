package br.com.atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int l, c, somaTodos = 0, somaDiagonal = 0;
		int[][] n1 = new int[3][3];

		System.out.println("Digite os valores da matriz: ");

		for (l = 0; l < n1.length; l++) {

			for (c = 0; c < n1[l].length; c++) {

				n1[l][c] = ler.nextInt();

				somaTodos += n1[l][c];

				if (l == c) {
					somaDiagonal += n1[l][c];
				}
			}
		}
		System.out.println("A soma dos valoes da matriz é: " + somaTodos);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);

	}
}