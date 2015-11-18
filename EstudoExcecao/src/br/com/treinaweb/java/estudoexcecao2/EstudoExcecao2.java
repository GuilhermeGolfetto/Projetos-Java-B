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
			System.out.println("Voc� digitou um n�mero invalido");
		} catch(Exception ex){ //exce��o generica para n�o dar erro pro usuario
			System.out.println("Ocorreu um erro! a Aplica��o ser� encerrada");
		} finally{ //ser� executado SEMPRE, indiferente do erro causado ou n�o
			System.out.println("Obrigado e volte sempre!");
		}
	}
	
	private static int LerNumero(Scanner leitor){
		System.out.print("Digite o n�mero:");
		return leitor.nextInt();
	}
	
	private static int DividirDoisPeloNumero(int num) throws ArithmeticException{
		//pode ser que de erro de op. aritm�tica
		return 2/num;
	}

}
