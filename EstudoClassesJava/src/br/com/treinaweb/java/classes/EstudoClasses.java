package br.com.treinaweb.java.classes;

public class EstudoClasses {

	public static void main(String[] args) {
		System.out.println("Valor Máximo para um int " + Integer.MAX_VALUE);
		System.out.println("Valor Minimo para um int " + Integer.MIN_VALUE);
		int a = Integer.parseInt("1"); //Converter uma String para um inteiro
		System.out.println(Integer.toString(a));
		
		System.out.println("Valor Máximo para um Double " + Double.MAX_VALUE);
		System.out.println("Valor Minimo para um Double " + Double.MIN_VALUE);
		double b = Double.parseDouble("1.45"); //Converter uma String para um inteiro
		System.out.println(Double.toString(b));
		
		char c = '5';
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		
		String nome = "Treinaweb";
		System.out.println(nome.substring(6, 9)); //web
		System.out.println(nome.toUpperCase()); //TREINAWEB
		System.out.println(nome.toLowerCase()); //treinaweb
	}

}
