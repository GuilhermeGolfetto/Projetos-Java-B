package br.com.treinaweb.Escopo;

public class Escopo {
	//Variavel de classe
	static String exemplo = "Escopo de vari�veis";
	
	public static void main(String[] args){
		String exemplo = "Escopo de vari�veis dentro do m�todo!";
		//vari�vel de metodo
		int i = 20;
		if(i > 10){
			//variavel local
			int x = 100;
			
			System.out.println(exemplo);
			
			System.out.println("O valor de x �:"+ x);
			
			System.out.println("O valor de i �:" + i);
			
		}
	}

}
