package br.com.treinaweb.java.basico.estudoswitch;

import java.util.Scanner;

public class EstudoSwitch {

	public static void main(String[] args) {
		//0 e 3 numeros baixos
		//4 e 6 numeros medios
		//6 >   numeros altos
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int num = leitor.nextInt();
		switch(num){
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Este número é baixo");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Este número é médio");
			break;
		default:
				System.out.println("Este numero é alto");
				break;
		
		}
		
	}

}
