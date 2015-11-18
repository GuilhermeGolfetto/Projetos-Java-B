package br.com.treinaweb.java.lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EstudoLista {

	public static void main(String[] args) {
		List<String> nomesAmigos = new ArrayList(); //criar uma lista sempre colocar o tipo de dado para não dar ruim
		Scanner leitor = new Scanner(System.in);//pode elementos repetidos
		String nome = "sair";
		do{
			System.out.print("Digite o nome:");
			nome = leitor.nextLine();
			if(!nome.equals("sair")){
				nomesAmigos.add(nome); //add coisas na lista
			}
		} while(!nome.equals("sair"));
		//nomesAmigos.add(1.5); <- não aceita usar double só strings
		System.out.println("Os seus amigos são:");
		for(int i=0; i < nomesAmigos.size(); i++){
			System.out.println(nomesAmigos.get(i)); //exibir
		}
	}

}
