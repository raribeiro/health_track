package br.com.healthtrack.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.healthtrack.connectors.ConnectionManager;
import br.com.healthtrack.security.CryptoPassMD5;

public class UsarioModel {
	
	private Connection conexao;	
	
	public void cadastraUsuario(String nome, String sobrenome, String email, String senha, double peso) throws SQLException {
		
		ConnectionManager connect = new ConnectionManager();
		PreparedStatement stmt = null;
		
		
		/* Criptografando a senha do usuário */
		String newpass = "";
		CryptoPassMD5 pass = new CryptoPassMD5();
		newpass = pass.criptografa(senha);
		
		
		try {
			
			conexao = connect.connect();
			
			/* Criação do objeto de conexão */
			String sql = "insert into t_usuario (id_usuario, prim_nm_usuario, seg_nm_usuario, email_usuario, sen_usuario, meta_peso_usuario) values (SQ_USUARIO.NEXTVAL,'"+ nome +"', '"+ sobrenome +"', '"+ email +"', '"+ newpass +"', 00.0)";
			stmt = conexao.prepareStatement(sql);
			stmt.executeQuery();
			
		} finally {
			try {
				stmt.close();
				connect.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
