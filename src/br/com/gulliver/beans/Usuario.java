package br.com.gulliver.beans;

public class Usuario {
	private int id;
	private String email;
	private String senha;
	private Perfil perfil;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String email, String senha, Perfil perfil) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public Perfil getPerfil() {
		return perfil;
	}
	
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public void logarUsuario() {
		/* Fazer login com do usuário usando as informacoes dessa classe */
	}
	
	public void cadastrarUsuario() {
		/* Cadastrar o usuário usando as infos dessa classe */
	}
	
	public String toString() {
		return "Usuario[id="+ this.getId() +", email="+ this.getEmail() + ", senha="+this.getSenha() +", perfil="+ this.getPerfil()+"]";
	}
}
