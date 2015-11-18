package br.com.treinaweb.java.generic;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.java.classes.Animal;

public class ManipuladorAnimais<T extends Animal> {
	//s� vai aceitar o que for animal
	private List<T> animais = new ArrayList<T>();
	//o que eu definir quando criar o Objeto � o que vai valer nesta lista.
	//se eu definir como Ave...somente Aves v�o entrar.
	//Genericos
	//Esse codigo � extremamente reutilizado
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
