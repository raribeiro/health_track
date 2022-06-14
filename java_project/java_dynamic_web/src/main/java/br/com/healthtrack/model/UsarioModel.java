package br.com.healthtrack.model;

import java.sql.SQLException;

import br.com.healthtrack.connectors.ConnectionManager;

public class UsarioModel {
	
	
	public double cadastraUsuario(String nome, String sobrenome, String email, String senha) {
		
		ConnectionManager conexao = new ConnectionManager();
		
		conexao.connect();
		
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	

}
