package br.com.atividade;

public class Cliente {
	
	String nome;
	String cidade;
	String cpf;
	int idade;

	void cadastrar() {
		System.out.println("Cadastro finalizado com sucesso.");
	}
	void comprar() {
		System.out.println("Compra realizada com sucesso.");
	}
	
	void pulaLinha() {
		System.out.println("\n");
	}
}
