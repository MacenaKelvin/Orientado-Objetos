package br.com.generation.exercicios;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao a1 = new Aviao();
		
		a1.nome = "Airbus";
		a1.marca = "A 320";
		a1.ano = 2014;
		a1.velocidade = 0;
		
		a1.acelerar(30);
		System.out.println("Avião : " + a1.nome +"\nModelo: " + a1.marca);
		System.out.println("Velocidade decolagem : " + a1.velocidade + "Km/h");
		
		a1.freiar(10);
		System.out.println("Avião : " + a1.nome);
		System.out.println("Velocidade pouso : " + a1.velocidade + "Km/h");

	}

}
