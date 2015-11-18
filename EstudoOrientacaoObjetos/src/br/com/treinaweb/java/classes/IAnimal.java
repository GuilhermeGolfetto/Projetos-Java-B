package br.com.treinaweb.java.classes;

public interface IAnimal {
	//tudo que estiver aqui deve ter na classe que implements ela
	String crescer();
	void dormir();
	void comer();
	void morrer();
	void emitirBarulho();
	void emitirBarulho(String barulho);
	void correr();
	
}
