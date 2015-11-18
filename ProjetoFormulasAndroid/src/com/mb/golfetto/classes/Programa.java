package com.mb.golfetto.classes;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args){

		int opcao;
		Codigos cod = new Codigos();
		
		Scanner teclado = new Scanner(System.in);
		
		for( ; ; ){
			System.out.printf("O que quer fazer (1)Fatorial  (2)Fibonnacci  (0)Sair:");
			opcao = teclado.nextInt();
			if(opcao == 0){
				break;
			}
			switch(opcao){
			case 1:
				//fatorial
				System.out.print("Digite o numero da Fatorial:");
				cod.setLimiteFat(teclado.nextInt());
				cod.Fatorial(cod.getLimiteFat());
				break;
			case 2:
				//fibonnacci
				System.out.print("Digite o limite da Sequencia:");
				cod.setLimiteFib(teclado.nextInt());
				cod.Fibonaci(cod.getLimiteFib());
				break;
			default:
				System.out.println("Número incorreto");
			}
		}
		
	}
	
}
