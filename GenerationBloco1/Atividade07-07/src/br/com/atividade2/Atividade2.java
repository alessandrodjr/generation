package br.com.atividade2;


public class Atividade2 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.marca = "Hawker";
		aviao1.modelo = " 737 Max";
		aviao1.companhiaAeria = "GOL";
		aviao1.ano = 2015;
		aviao1.capacidade = 320;
		
		aviao1.decolar();
		aviao1.pousar();
		
		aviao1.pulaLinha();
		
		System.out.println("Dados da Areronave");
		System.out.println("Marca: " + aviao1.marca);
		System.out.println("Modelo: " + aviao1.modelo);
		System.out.println("Companhia Aeria: " + aviao1.companhiaAeria);
		System.out.println("Capacidade: " + aviao1.capacidade);
		System.out.println("Ano de Fabricação: " + aviao1.ano);
	

}

}