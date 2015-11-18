package br.com.treinaweb.java.estudo.excecao.tuto;

public class Exemplo001 {
	
	static int obterDivisao(int v1,int v2)
			throws Exception{
		/*A Exceção avisa que pode dar erro no
		 * codigo e quem a chamar deve tratar o erro
		 * não colocar no main*/
			int r =0;
			r = v1/v2;
			return r;
		}
	public static void main(String[] args) {
		int resposta =0;
		
		try{
			resposta = obterDivisao(6,0);
		} catch(Exception e){
			System.out.println("Ocorreu um erro");
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("resposta = " + resposta);
		
	}

}
