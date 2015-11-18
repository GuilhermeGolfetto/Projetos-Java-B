package br.com.treinaweb.java.estudofor;

import java.util.Scanner;
public class EstudoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o numero");
		int num = leitor.nextInt();
		int res;
		for(int i = 1 ; i <= 10 ; i++){
			res = num * i;
			System.out.printf("%d X %d = %d %n",num,i,res);
		}
	}

}
