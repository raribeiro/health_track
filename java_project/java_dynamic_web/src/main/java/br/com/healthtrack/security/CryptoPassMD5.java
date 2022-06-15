package br.com.healthtrack.security;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CryptoPassMD5 {
	
	private String pass;
	
	public String criptografa(String senha) {
		
		MessageDigest md;
		String retorno = "";
		
		try {
			md = MessageDigest.getInstance("SHA-256");
			BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
			retorno = hash.toString(16);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
		
	}

}
