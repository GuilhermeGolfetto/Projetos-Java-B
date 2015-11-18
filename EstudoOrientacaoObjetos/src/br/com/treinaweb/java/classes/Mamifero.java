package br.com.treinaweb.java.classes;

public final class Mamifero extends Animal{
	//ninguem pode herdar nada dela
	public Mamifero(String nome, int idade, String especie,double tamanhoCauda) {
		super(nome, idade, especie); //referencia a classe pai
		this.tamanhoCauda = tamanhoCauda;
		//super.comer(); vem da classe-pai
	}

	private double tamanhoCauda;

	public double getTamanhoCauda() {
		return tamanhoCauda;
	}

	public void setTamanhoCauda(double tamanhoCauda) {
		this.tamanhoCauda = tamanhoCauda;
	}

	@Override
	public void correr() {
		System.out.println("Mamifero Correndo...");
		
	}
	
}
