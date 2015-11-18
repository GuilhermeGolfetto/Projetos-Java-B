package br.com.treinaweb.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoArrays {

	public static void main(String[] args) {
		String[] nomesAmigos = new String[5]; //array de 5 strings
		String[] nomesAmigos2 = new String[5];
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i <= 4; i++){
			System.out.printf("Digite o nome do amigo[%d]:",i);
			nomesAmigos[i] = leitor.nextLine();
			nomesAmigos2[i] = nomesAmigos[i];
		}
		//Arrays.fill(nomesAmigos, "Amigo"); //preenchimento automatico
		Arrays.sort(nomesAmigos); //ordem ascendente
		Arrays.sort(nomesAmigos2);
		System.out.println("Seus amigos são:");
		for(int i = 0; i <= 4; i++){
			System.out.println("Amigo: " + nomesAmigos[i]);
		}
		System.out.printf("Tamanho do vetor: %d %n",nomesAmigos.length);//independente do que está preenchido
		System.out.println("Os vetores são iguais: " + Arrays.equals(nomesAmigos, nomesAmigos2));
		System.out.println("A Posição do Jon é:" + Arrays.binarySearch(nomesAmigos,"Cat"));
	}

}
