package com.mb.golfetto.exercicio.classes.programa1;

public class Programa1 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Jurandir";
		p.idade = 15;
		
		p.fazAniversario();
		
		System.out.println(p.nome + " tem " + p.idade + " anos");
		

		p.fazAniversario();
		
		System.out.println(p.nome + " tem " + p.idade + " anos");
		

		p.fazAniversario();
		
		System.out.println(p.nome + " tem " + p.idade + " anos");
	}

}
