package br.com.treinaweb.java.basico.ifestudo;

import java.util.Scanner;

public class EstudoIf {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Scanner leitor2 = new Scanner(System.in);
		System.out.print("Digite a sua idade:");
		int idade = leitor.nextInt();
		System.out.println("Digite (M) se voc� � Homen ou (F) se voc� � mulher:");
		String sexo = leitor2.nextLine();
		if(sexo.equals("M")){
			if(idade >= 21){
				System.out.println("Voc� n�o vai mais crescer");
			}
			else{
				System.out.println("Voc� vai crescer mais!");
			}
		}
		else if(sexo.equals("F")){
			if(idade >= 18){
				System.out.println("Voc� n�o vai mais crescer");
			}
			else{
				System.out.println("Voc� vai crescer mais!");
			}
		}
		else{
			System.out.println("Sexo Invalido");
		}

	}

}
