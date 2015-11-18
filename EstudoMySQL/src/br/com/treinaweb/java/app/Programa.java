package br.com.treinaweb.java.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.treinaweb.java.mysql.FabricaConexaoMySQL;

public class Programa {

	public static void main(String[] args) {

		try {
			Connection connection = FabricaConexaoMySQL.criarConexao();
			System.out.println("A conexão foi criada");
			
			
			PreparedStatement statement = FabricaConexaoMySQL.criarPreparedStatement(connection,
					"INSERT INTO pessoas(nome, idade) VALUES (?,?)");
			statement.setString(1, "Jose");
			statement.setInt(2, 20);
			statement.execute();
			
			ResultSet rs = FabricaConexaoMySQL.executarSelect(connection, "SELECT * FROM pessoas");
			System.out.println("Pessoas no Banco de dados");
			//varrer resultado do comando
			while(rs.next()){ //next() retorna true enquanto houver linhas no objeto rs
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getInt("idade"));
				System.out.println("**********************");
			}
			System.out.println("Fim da leitura do banco de dados");
		} catch (InstantiationException | IllegalAccessException | 
				ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
