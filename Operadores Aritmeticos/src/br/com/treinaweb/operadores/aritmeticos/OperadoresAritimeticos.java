package br.com.treinaweb.operadores.aritmeticos;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		/*double resultadoDivisao = a /5.0;
		System.out.printf("%d + %d = %d %n",a,b,a+b);
		System.out.printf("%d - %d = %d %n",a,b,a-b);
		System.out.printf("%d X %d = %d %n",a,b,a*b);
		System.out.printf("%d / %d = %f %n",a,b,resultadoDivisao);
		System.out.printf("%d modulo %d = %d",a,b,a%b);*/
		
		System.out.printf("%d > %d = %b %n",a,b,a>b);
		System.out.printf("%d < %d = %b %n",a,b,a<b);
		System.out.printf("%d <= %d = %b %n",a,b,a<=b);
		System.out.printf("%d >= %d = %b %n",a,b,a>=b);
		System.out.printf("%d = %d = %b %n", a,b,a==b); //2 =
		System.out.printf("%d != %d = %b %n",a,b,a!=b);
	}

}
