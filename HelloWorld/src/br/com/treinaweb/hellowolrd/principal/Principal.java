package br.com.treinaweb.hellowolrd.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nomePessoa = "Guilherme";
		int idadePessoa = 21;
		double pesoPessoa = 80.0; 
		
		System.out.println("Hello, World!");
		System.out.println("Ol�," + nomePessoa);
		System.out.println("Voc� tem " + idadePessoa + " Anos.");
		System.out.println("Voc� pesa " + pesoPessoa + " quilos");
		
		Scanner leitor = new Scanner(System.in);
		//classe responsavel por ler inform��oes do teclado
	
		
		System.out.println("Digite a sua idade:");
		
		String idade = leitor.nextLine(); //poderia ter usado o nextInt() que n�o precisaria converter
		//metodo que leia o que o usuario digitar at� um Enter
		
		
		int idadeConvertida = Integer.parseInt(idade);
		//Converter (cast) idade de String para int 
		
		if(idadeConvertida >= 18){
			System.out.println("Usuario � maior de idade");
		}
		else{
			System.out.println("Usuario � menor de idade");
		}
		
		//float a = 1.5F;
		//F para indicar que � float
		double a = 1.5;
		int b = (int) a;
		//Converter a para inteiro - s� para a familia numeros
		
		System.out.println(b);
		
		int x = 2;
		double  c = x;
		//funciona porque o int cabe dentro do double
		System.out.println(c);
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.somar());
		
		
	}

}
