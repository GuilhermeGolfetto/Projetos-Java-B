package br.com.treinaweb.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstudoMaps {

	public static void main(String[] args) {
		Map<String, Integer> notas = new HashMap<String, Integer>(); 
		Scanner leitor = new Scanner(System.in);//mapa não pode elemento duplicado
		Scanner leitor2 = new Scanner(System.in);
		boolean continuar = true;
		while(continuar){
			System.out.print("Digite o nome do Aluno:");
			String nomeAluno = leitor.nextLine();
			System.out.print("Digite a nota do Aluno");
			int notaAluno = leitor2.nextInt();
			notas.put(nomeAluno, notaAluno); //atribuindo valores ao mapa
			System.out.print("Deseja Continuar? (S) (N)");
			String ehPraContinunar = leitor.nextLine();
			if(ehPraContinunar.equals("N")){
				continuar = false;
			}
		}
		System.out.println("As notas desta classe foram");
		for(String nomeAluno : notas.keySet()){ //foreach -keySet retorna o conjunto das chaves
			System.out.println(nomeAluno + " = " + notas.get(nomeAluno));
		}
	}

}
