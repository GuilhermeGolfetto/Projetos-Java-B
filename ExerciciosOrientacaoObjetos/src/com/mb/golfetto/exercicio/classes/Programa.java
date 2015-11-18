package com.mb.golfetto.exercicio.classes;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Data data = new Data();
		
		func.setNome("Guilherme");
		func.setDepartamento("Desenvolvimento");
		func.setRg("123.456.78-9");
		func.setDataEntrada(data.preencherData(15, 11, 2015));
		func.setSalario(1800.50);
		
		func.recebeAumento(50.00);
		
		
		func.mostrar();
		
	}

}
