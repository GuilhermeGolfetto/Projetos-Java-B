package com.mb.golfetto.exercicio.classes;

public class Fibonacci {

	
	int CalcularFibonacci(int num){ //Fun��o para Calculo da sequencia, recebeu o valor de limite
		int numAnt = num - 1;
		int proxNum = num + numAnt;
		numAnt = num;
		num = proxNum;
		return proxNum;
	}
}
