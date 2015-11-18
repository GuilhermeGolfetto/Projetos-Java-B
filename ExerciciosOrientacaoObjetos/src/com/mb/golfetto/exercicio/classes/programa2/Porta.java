package com.mb.golfetto.exercicio.classes.programa2;

public class Porta {
	public boolean aberta = true;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	void abre(){
		aberta = true;
		System.out.println("A porta esta aberta");
	}
	void fechar(){
		aberta = false;
		System.out.println("A porta esta fechada");
	}
	
	void pintar(String cor){
		this.cor = cor;
		System.out.println("A porta agora é:" + this.cor);
	}
	
	boolean estaAberta(){
		if(aberta == true){
			return true;
		}
		else{
			return false;
		}
	}

}
