package br.com.treinaweb.java.app;
import java.util.ArrayList;
import java.util.List;

//pacote onde está a classe animal
import br.com.treinaweb.java.classes.Animal;
import br.com.treinaweb.java.classes.Ave;
import br.com.treinaweb.java.classes.Mamifero;
import br.com.treinaweb.java.generic.ManipuladorAnimais;
import br.com.treinaweb.java.generic.ManipuladorAves;

public class Programa {

	public static void main(String[] args) {
		
		ManipuladorAves manipuladorAnimais = new ManipuladorAves();
		//ManipuladorAnimais<Integer> teste= new ManipuladorAnimais<Integer>(); // <-  não funciona...
		Ave ave = new Ave("Tucano",3,"Tucano",6);
		System.out.println("Inserir a ave");
		manipuladorAnimais.inserirAnimal(ave); //inserir na lista uma ave...e somente ave
		Ave aveRecuperada = manipuladorAnimais.getPorPosicao(0);
		System.out.println("Ave recuperada: " + aveRecuperada.getNome());
		List<Ave> aves = manipuladorAnimais.getAnimais();
		for (Ave a : aves){ //foreach
			System.out.println("Ave recuperada: " + a.getNome());
		}
		
												/*
												//Instanciar um Objeto
												Animal cachorro = new Animal("Totó", 5, "Chachorro");
												Animal.quantidadeAnimais++;
												//setando as caracteristicas do Objeto
												try {
													System.out.println(cachorro.getNome());
													System.out.println(cachorro.getIdade());
													System.out.println(cachorro.isEstaVivo());
													cachorro.dormir();
													cachorro.comer();
													System.out.println(cachorro.crescer());
													cachorro.morrer();
													Animal.verificarSeEstaVivo(cachorro); //metodo estático
													cachorro.emitirBarulho("au au");
													System.out.println("Qntd. animais cadastrados:" + Animal.quantidadeAnimais);
												} catch (Exception e) {
														System.out.println(e.getMessage());
													}
												/*											
												 
												Mamifero cachorro = new Mamifero("Totó", 5, "Cachorro", 2);
												Ave tucano = new Ave("Ze",2, "Tucano",6);
												Ave tucano2 = new Ave("Ze",2,"Tucano",6);
												//Animal teste = new Ave(); //->Funciona...mas os metodos da ave não vai aparecer
												
												//Animal n = new Animal(); ->não vai funcionar porque a classe animal é abstrata
												
												List <Integer> lista = new ArrayList<Integer>(); //uma lista que só vai ser Inteira
												lista.add(1);
												int numero = lista.get(0); //não precisa transformar em Integer
												
												System.out.println(tucano.equals(tucano2));
												
												System.out.println("========================");
												tucano.emitirBarulho("hahaha");
												cachorro.emitirBarulho("au au");
												System.out.println("========================");
												
												
												System.out.println(tucano.getClass());
												System.out.println(tucano.toString());
												
												tucano.correr();
												cachorro.correr();
												
												Animal a = new Ave("teste",2,"teste",5);
												a.correr();
												
												try {
													cachorro.comer();
													System.out.println(cachorro.crescer());
													tucano.setQuantidadeOvos(6);
													tucano.comer();
													System.out.println(tucano.crescer());
													tucano.dormir();
												} catch (Exception e) {
													e.printStackTrace();
												}
												*/
		

	}

}
