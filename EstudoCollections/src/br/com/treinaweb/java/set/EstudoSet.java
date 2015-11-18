package br.com.treinaweb.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EstudoSet {

	public static void main(String[] args) {
		Set<String> nomesAmigos = new HashSet<String>(); //não pode elementos repetidos
		Scanner lietor = new Scanner(System.in);
		String nome = "";
		while(!nome.equals("sair")){
			System.out.print("Digite um nome");
			nome = lietor.nextLine();
			if(!nome.equals("sair")){
				nomesAmigos.add(nome);
			}
		}
		System.out.println("Os nomes os seus amigos são:"); //ele não tem get() então precisa do Iterator
		Iterator<String> it = nomesAmigos.iterator(); //ele quem vai varrer o Set
		while(it.hasNext()){ //se tem proximo ele retorna true
			System.out.println(it.next()); //me retorna o proximo elemento
		}
	}

}
