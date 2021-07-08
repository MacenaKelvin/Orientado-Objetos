package br.com.generation.exercicios;

public class Aviao {
	//Atributos - variaveis
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//metodos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
		
	}
	void freiar(int reduzir) {
		
		velocidade = velocidade - reduzir;
		
		
	}
}
