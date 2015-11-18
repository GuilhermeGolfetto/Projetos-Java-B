package br.com.treinaweb.hellowolrd.principal;

public class Calculadora {
	
	int a = 2;
	int b = 2;
	//variaveis publicas,todos os metodos podem ver
	
	public int somar(){
		if(verificar()){
			return a + b;
		} else{
			return 0;
		}
	}
	
	public boolean verificar(){
		//ele retorna verdadeiro caso a condicao abaixo for verdade
		return a > 0 && b > 0;
		
	}
}
