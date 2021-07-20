package br.com.aula;

public class Start {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Alessandron Dia Jr");
		aluno1.setCpf("123.456.789-00");
		aluno1.setRa("D26cdb-3");
		aluno1.setCurso("Ciencias da Computação");
		
		
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getCpf());
		System.out.println(aluno1.getRa());
		System.out.println(aluno1.getCurso());

	}

}
