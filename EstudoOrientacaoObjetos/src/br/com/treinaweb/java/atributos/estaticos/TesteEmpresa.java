package br.com.treinaweb.java.atributos.estaticos;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa em1 = new Empresa();
		
		em1.nome = "Empresa 1";
		Empresa.ano = 2001;
		
		System.out.println(em1.nome);
		System.out.println(Empresa.ano);
		
		Empresa em2 = new Empresa();
		
		em2.nome = "Empresa 2";
		
		System.out.println(em2.nome);
		System.out.println(Empresa.ano);
		
		Empresa em3 = new Empresa();
		
		em3.nome = "Empresa 3";
		Empresa.ano = 2003; //porque é um atributo estático
		
		System.out.println(em3.nome);
		System.out.println(Empresa.ano);
		
		System.out.println(em1.nome);
		System.out.println(Empresa.ano);
	}

}
