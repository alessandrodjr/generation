package br.com.atividade;

public interface Animal {

}
private String nome;
private int idade;

void emitirSom() {
	System.out.println("Emitindo som...");
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}