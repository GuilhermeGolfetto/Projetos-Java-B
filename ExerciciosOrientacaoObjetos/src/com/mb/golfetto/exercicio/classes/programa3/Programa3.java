package com.mb.golfetto.exercicio.classes.programa3;

public class Programa3 {

	public static void main(String[] args) {
		
		Casa c = new Casa();
		c.porta1 = true;
		c.porta3 = true;
		
		c.pintar("Azul");
		
		System.out.println("Existem " + c.quantasPortasAbertas() + " portas abertas na casa");
		System.out.println("Existem " + c.quantasPortasFechadas() + " portas fechadas na casa");

	}

}
