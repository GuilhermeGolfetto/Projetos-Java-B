package com.mb.golfetto.exercicio.classes.programa2;

import java.util.Scanner;

public class Programa2 {

	private static Scanner teclado;

	public static void main(String[] args) {
		Porta porta = new Porta();
		teclado = new Scanner(System.in);
		porta.dimensaoX = 2.0;
		porta.dimensaoY = 1.5;
		porta.dimensaoZ = 0.5;
		
		porta.abre();
		
		System.out.println("A porta esta aberta?" + porta.estaAberta());
		
		porta.fechar();
		
		System.out.println("A porta esta aberta?" + porta.estaAberta());
		
		System.out.println("Qual cor vamos pintar a porta?");
		porta.pintar(teclado.nextLine());
		
	}

}
