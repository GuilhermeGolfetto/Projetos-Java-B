package com.mb.golfetto.classes;

public class Codigos {
	
	private int limiteFat;
	private int limiteFib;
	
	public int getLimiteFat() {
		return limiteFat;
	}

	public void setLimiteFat(int limiteFat) {
		this.limiteFat = limiteFat;
	}

	public int getLimiteFib() {
		return limiteFib;
	}

	public void setLimiteFib(int limiteFib) {
		this.limiteFib = limiteFib;
	}

	//Fatorial
	public void Fatorial(int x){
		int fatorial = 1;
		for(int i = 1; i <= x; i++){
			fatorial *= i;
		}
		System.out.println(fatorial);
	}
	
	public void Fibonaci(int lim){
		int proxNum,num,cont,numAnt;
		num=1;
		proxNum=0;
		numAnt=0;
		for(cont=0;cont<lim;cont++){
			proxNum = num + numAnt;
			System.out.printf("%d %t",proxNum);
			numAnt = num;
			num = proxNum;
		}
		
	}
		

}
