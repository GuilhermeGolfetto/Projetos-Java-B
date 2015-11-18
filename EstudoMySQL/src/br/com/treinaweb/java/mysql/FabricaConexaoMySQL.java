package br.com.treinaweb.java.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class FabricaConexaoMySQL {

	public static Connection criarConexao() throws InstantiationException,
	IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance(); //encontrar a classe que conecta
		String stringConexao = "jdbc:mysql://127.0.0.1/treinaweb_jse?user=root&password=root";
		Connection connection= DriverManager.getConnection(stringConexao);
		return connection;
		//ele quem cria a conexão
	}
	
	public static ResultSet executarSelect(Connection conn, String sql) throws SQLException{
		Statement query = conn.createStatement(); //objeto que faz as consultas
		return query.executeQuery(sql);
	}
	
	public static PreparedStatement criarPreparedStatement(Connection conn, String sql) throws SQLException{
		//sql injection segurança essa funcao apenas link o que for escrito com a conexao
		return conn.prepareStatement(sql);
		
	}
}
