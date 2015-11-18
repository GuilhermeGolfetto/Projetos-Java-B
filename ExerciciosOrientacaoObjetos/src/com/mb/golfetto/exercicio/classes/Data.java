package com.mb.golfetto.exercicio.classes;

public class Data {
	public int ano;
	public int mes;
	public int dia;
	
	public String preencherData(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
