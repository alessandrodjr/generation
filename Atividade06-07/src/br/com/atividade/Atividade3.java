package br.com.atividade;

import java.util.Random;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();

		int l, c;
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];

		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		System.out.println("Gerando automaticamente valores de N1 e N2... \n");

		for (l = 0; l < n1.length; l++) {

			for (c = 0; c < n1[l].length; c++) {

				n1[l][c] = gerador.nextInt(99);
				n2[l][c] = gerador.nextInt(99);

				System.out.print("N1 " + n1[l][c] + " ");
				System.out.print("N2 " + n2[l][c] + " ");

			}
			System.out.print("\n");

		}
		
		System.out.println("\nSoma de N1 e N2");
		System.out.print("\n");

		for (l = 0; l < n1.length; l++) {

			for (c = 0; c < n1[l].length; c++) {

				m1[l][c] = n1[l][c] + n2[l][c];

				System.out.print( m1[l][c] + " ");

			}
			System.out.print("\n");
		}

		System.out.println("\nSubtração de N1 e N2");
		System.out.print("\n");
		for (l = 0; l < n1.length; l++) {

			for (c = 0; c < n1[l].length; c++) {

				m2[l][c] = n1[l][c] - n2[l][c];

				System.out.print(m2[l][c] + " ");

			}
			System.out.print("\n");
		}

	}

}