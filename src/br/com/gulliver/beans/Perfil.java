package br.com.gulliver.beans;

public class Perfil {
	private int cd_perfil;
	private String email;
	private String senha;
	
	public Perfil(int cd_perfil, String email, String senha) {
		super();
		this.cd_perfil = cd_perfil;
		this.email = email;
		this.senha = senha;
	}
	
	public Perfil() {
		super();
	}
	
	public int getCd_perfil() {
		return cd_perfil;
	}
	
	public void setCd_perfil(int cd_perfil) {
		this.cd_perfil = cd_perfil;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
