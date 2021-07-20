package br.com.atividade;

public class Atividade1 {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		
			cliente1.nome = "Alessandro Dias";
			cliente1.cidade = "São Paulo";
			cliente1.idade = 24;
			cliente1.cpf = "123.456.789.00";
			
			cliente1.cadastrar();
			cliente1.comprar();
			
			cliente1.pulaLinha();
			
			System.out.println("Dados do cliente 1");
			System.out.println(cliente1.nome);
			System.out.println(cliente1.cidade);
			System.out.println(cliente1.idade);
			System.out.println(cliente1.cpf);
		

	}

}
