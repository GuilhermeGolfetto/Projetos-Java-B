package br.com.treinaweb.java.interfaces;

public class Interfaces {
	
	public interface Cadastros{
		public void incluir();
		public void alterar();
		public void excluir(int codigo);
	}
	
	public interface Enderecos{
		public String getEndereco();
		public void setEndereco();
		public String getCep();
		public void setCep();
		public String getCidade();
		public void setCidade(String cidade);
	}

}
