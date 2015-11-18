package br.com.treinaweb.operadoresrelacionais;

public class OperadoresRelacionais {
	
	public static void main(String[] args){
		int a = 3;
		int b = 5;
		
		System.out.printf("%d == 7 E %d == 5 -> %b %n", a, b, a == 7 && b == 5);
		System.out.printf("%d == 7 OU %d == 5 -> %b", a, b, a == 7 || b == 5);
		System.out.printf("%d == 3 negado -> %b",a, a != 3);
	}

}
