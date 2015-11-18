package com.mb.golfetto.exercicio.classes.programa3;

public class Casa {
	public String cor;
	public boolean porta1;
	public boolean porta2;
	public boolean porta3;
	
	void pintar(String cor){
		this.cor = cor;
		System.out.println("A casa agora é:" + this.cor);
	}
	
	int quantasPortasAbertas(){
		int quantd = 0;
		if(porta1 == true){
			quantd++;
		}
		if(porta2 == true){
			quantd++;
		}
		if(porta3 == true){
			quantd++;
		}
		return quantd;
	}
	int quantasPortasFechadas(){
		int quantd = 0;
		if(porta1 != true){
			quantd++;
		}
		if(porta2 != true){
			quantd++;
		}
		if(porta3 != true){
			quantd++;
		}
		return quantd;
	}
}
