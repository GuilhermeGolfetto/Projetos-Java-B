package com.mb.golfetto.exercicio.classes;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	//FIM GETTERS E SETTERS

	
	
	//METODOS
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12; 
	}
	public void mostrar(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("RG: " + this.getRg());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Data de Entrada: " + this.getDataEntrada());
		System.out.println("Recebimento Anual:" + this.calculaGanhoAnual());
	}
}
