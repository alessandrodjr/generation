package br.com.atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        int idade, cont = 0, sexo, humor, pessoasCalma = 0, mulheresNervosas = 0, homemAgressivo = 0, outrosCalmo = 0,
                idosoNervoso = 0, menorCalmo = 0;

        while (cont < 150) {
            System.out.println("Qual a sua idade");
            idade = ler.nextInt();
            System.out.println("Qual o seu sexo\n" + "1-Feminino" + "\n2-Masculino" + "\n3-Outros");
            sexo = ler.nextInt();
            System.out.println("Qual o seu humor\n" + "1-Calme" + "\n2-Nervose" + "\n3-Agressive");
            humor = ler.nextInt();
            cont++;
            System.out.println("\n" + "\n");

            if (humor == 1) {
                pessoasCalma++;

            }
            if (sexo == 1 && humor == 2) {
                mulheresNervosas++;
            }
            if (sexo == 2 && humor == 3) {
                homemAgressivo++;
            }
            if (sexo == 3 && humor == 1) {
                outrosCalmo++;
            }
            if (idade > 40 && humor == 2) {
                idosoNervoso++;
            }
            if (idade < 18 && humor == 1) {
                menorCalmo++;
            }
        }

        System.out.println("O número de pessoas calmas é: " + pessoasCalma);
        System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
        System.out.println("O número de homens agressivos é: " + homemAgressivo);
        System.out.println("O número de outros calmos: " + outrosCalmo);
        System.out.println("O número de pessoas nervosas com mais de 40 anos: " + idosoNervoso);
        System.out.println("O número de pessoas calmas com menos de 18 anos: " + menorCalmo);

    }

}