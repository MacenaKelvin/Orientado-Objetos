package br.com.generation.exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		
Clientes cliente1 = new Clientes();
		
		cliente1.setNome("Kelvin");
		cliente1.setSexo("Masculino");
		cliente1.setIdade(28);
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Sexo: " + cliente1.getSexo());
		System.out.println("Idade: " + cliente1.getIdade());
	

	}

}
