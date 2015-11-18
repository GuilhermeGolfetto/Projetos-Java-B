package br.com.treinaweb.java.estudoexcecao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoExcecao2 {
	/*bom para SQL
	 * o Try vai abrir o SQL, se der erro no codigo, cai no
	 * catch que vai tentar tratar o erro
	 * e o finally vai fechar o SQL*/

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		try{ //se tiver algum erro
			int num = LerNumero(leitor);
			System.out.printf("2 / %d = %d",num , DividirDoisPeloNumero(num));
		} catch(InputMismatchException ex){ //primeiro bloco a cair se der erro
			System.out.println("Você digitou um número invalido");
		} catch(Exception ex){ //exceção generica para não dar erro pro usuario
			System.out.println("Ocorreu um erro! a Aplicação será encerrada");
		} finally{ //será executado SEMPRE, indiferente do erro causado ou não
			System.out.println("Obrigado e volte sempre!");
		}
	}
	
	private static int LerNumero(Scanner leitor){
		System.out.print("Digite o número:");
		return leitor.nextInt();
	}
	
	private static int DividirDoisPeloNumero(int num) throws ArithmeticException{
		//pode ser que de erro de op. aritmética
		return 2/num;
	}

}
