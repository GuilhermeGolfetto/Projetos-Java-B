package br.com.treinaweb.java.estudowhile;

import java.util.Scanner;

public class EstudoWhile {
	
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int contator = 0;
		String continua = "S";
		while(continua.equals("S") && contator <= 4){
			System.out.println("Valor do contador:" + contator);
			System.out.printf("Deseja continuar (S) ou (N)");
			continua = leitor.nextLine();
			contator++;
		}
	}

}
