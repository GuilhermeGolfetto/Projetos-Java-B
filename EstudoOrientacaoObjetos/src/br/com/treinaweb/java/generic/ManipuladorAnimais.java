package br.com.treinaweb.java.generic;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.java.classes.Animal;

public class ManipuladorAnimais<T extends Animal> {
	//só vai aceitar o que for animal
	private List<T> animais = new ArrayList<T>();
	//o que eu definir quando criar o Objeto é o que vai valer nesta lista.
	//se eu definir como Ave...somente Aves vão entrar.
	//Genericos
	//Esse codigo é extremamente reutilizado
	public List<T> getAnimais(){
		return animais;
	}
	
	public T getPorPosicao(int indice){
		return animais.get(indice);
	}
	
	public void inserirAnimal(T animal){
		animais.add(animal);
	}
}
