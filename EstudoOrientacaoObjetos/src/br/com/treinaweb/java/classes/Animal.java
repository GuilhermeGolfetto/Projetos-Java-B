package br.com.treinaweb.java.classes;

public abstract class Animal implements IAnimal {
	//Só serve para base de Herança para as classes filhas porque é abstract
	
	/*Atributos - Caracteristas que a Classes deve ter
	visibilidade - tipo de dado - nome */
	public static int quantidadeAnimais = 0;  
	
	protected String nome;
	protected int idade;
	protected String especie;
	protected boolean estaVivo;
	
	
	
	//Construtores
	public Animal(){
		//construtor - inicializador de objetos
		estaVivo = true;
	}
	
	public Animal(String nome){
		this.nome = nome; //igual os setters
	}
		
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}

	
	
	
	//Metodos acessores que inserem dados nos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(nome.equals("")){
			throw new Exception("O nome não pode ser vazio");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	
	/*Métodos - Comportamentos da Classes
	visibilidade - tipo de retorno - nome - (parametros)*/
	public String crescer(){
		return nome + " está crescendo...";
	}
	
	public void dormir(){
		System.out.println(nome + " está dormindo...");
	}
	
	public void comer(){
		System.out.println(nome + " está comendo...");
	}
	public void morrer(){
		estaVivo = false;
		System.out.println(nome + " Infelizmente morreu");
	}
	public final void emitirBarulho(){ //assim não pode ser sobreescrito
		System.out.println("Barulho do animal: Rawr");
	}
	
	public void emitirBarulho(String Barulho){
		System.out.println("Baruho do animal:" + Barulho);
	}
	public static void verificarSeEstaVivo(Animal animal){
		System.out.println(animal.isEstaVivo() ? animal.getNome() + " stá vivo!" : 
			"Infelizmente, " + animal.getNome() + " morreu");
	}
	
	public abstract void correr();
}
