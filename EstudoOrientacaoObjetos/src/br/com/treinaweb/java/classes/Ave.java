package br.com.treinaweb.java.classes;

public final class Ave extends Animal {
	//ninguem pode herdar dela por causa do final
	private int QuantidadeOvos;
	
	

	public Ave(String nome, int idade, String especie,int quantidadeOvos) {
		super(nome, idade, especie);
		this.QuantidadeOvos = quantidadeOvos;
	}

	public int getQuantidadeOvos() {
		return QuantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		QuantidadeOvos = quantidadeOvos;
	}
	
	@Override //anotation - sobreescrever alguma coisa
	public String toString() {
		return this.getNome() + " " + this.getEspecie();
	}
	@Override
	public boolean equals(Object obj) {
		Ave ave2 = (Ave)obj;
		return this.getNome().equals(ave2.getNome()) && 
				this.getEspecie().equals(ave2.getEspecie()) &&
				this.getIdade() == ave2.getIdade() &&
				this.getQuantidadeOvos() == ave2.getQuantidadeOvos();
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public void emitirBarulho(String Barulho) {
		System.out.println(Barulho.toUpperCase());
	}

	@Override
	public void correr() {
		System.out.println("Ave Voando....");
		
	}
	

}


