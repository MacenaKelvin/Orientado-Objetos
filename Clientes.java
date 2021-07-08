package br.com.generation.exercicios;

public class Clientes {
	String nome;
	String sexo;
	int idade;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setSexo(String newSexo) {
		this.sexo = newSexo;
	}
	
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
