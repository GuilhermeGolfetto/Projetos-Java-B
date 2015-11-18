package br.com.treinaweb.interpolacaostring;

public class InterpolacaoString {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 5;
		int resultado = ( a * b ) + c ;
		//System.out.println("O resultado de " + a + " X " + b + " + " + c + " é " + resultado);
		System.out.printf("O resultado de %d x %d + %d = %d", a, b, c, resultado); //interpolação de string
	}

}
