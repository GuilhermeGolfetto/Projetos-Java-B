package br.com.treinaweb.java.estudoexececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoExcecao {
	/*bom para SQL
	 * o Try vai abrir o SQL, se der erro no codigo, cai no
	 * catch que vai tentar tratar o erro
	 * e o finally vai fechar o SQL*/

	public static void main(String[] args) {
		try{ //se tiver algum erro
			Scanner leitor = new Scanner(System.in);
			System.out.print("Digite o n�mero:");
			int num = leitor.nextInt();
			System.out.printf("%d x 2 = %d",num,num*2);
		} catch(InputMismatchException ex){ //primeiro bloco a cair se der erro
			System.out.println("Voc� digitou um n�mero invalido");
		} catch(Exception ex){ //exce��o generica para n�o dar erro pro usuario
			System.out.println("Ocorreu um erro! a Aplica��o ser� encerrada");
			System.out.println("Mensagem de erro:" + ex.getCause());
		} finally{ //ser� executado SEMPRE, indiferente do erro causado ou n�o
			System.out.println("Obrigado e volte sempre!");
		}
	}
	

}
