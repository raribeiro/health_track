package br.com.healthtrack.controller;

import java.sql.SQLException;

import br.com.healthtrack.model.UsarioModel;

public class UsuarioController {
	
	private String prim_nm_usuario;
	private String seg_nm_usuario;
	private String email_usuario;
	private String senha_usuario;
	private double meta_peso_usuario;
	
	
	public void cadastraUsuario() throws SQLException {
		
		UsarioModel usuario = new UsarioModel();
		
		usuario.cadastraUsuario(prim_nm_usuario, seg_nm_usuario, email_usuario, senha_usuario, meta_peso_usuario);
		
		
	}
	
	
	public String getPrim_nm_usuario() {
		return prim_nm_usuario;
	}
	
	public void setPrim_nm_usuario(String prim_nm_usuario) {
		this.prim_nm_usuario = prim_nm_usuario;
	}
	
	public String getSeg_nm_usuario() {
		return seg_nm_usuario;
	}
	
	public void setSeg_nm_usuario(String seg_nm_usuario) {
		this.seg_nm_usuario = seg_nm_usuario;
	}
	
	public String getEmail_usuario() {
		return email_usuario;
	}
	
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	
	public String getSenha_usuario() {
		return senha_usuario;
	}
	
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	
	public double getMeta_peso_usuario() {
		return meta_peso_usuario;
	}
	
	public void setMeta_peso_usuario(double d) {
		this.meta_peso_usuario = d;
	}

}
