package br.com.gulliver.beans;

public class Perfil {
	private int id;
	private String nome;
	private String bios;
	private String email;
	private Contato contato;
	private Atividade[] atividade;
	
	public Perfil() {
		super();
	}
	
	public Perfil(int id, String nome, String bios, String email, Contato contato, Atividade[] atividade) {
		super();
		this.id = id;
		this.nome = nome;
		this.bios = bios;
		this.email = email;
		this.contato = contato;
		this.atividade = atividade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBios() {
		return bios;
	}
	
	public void setBios(String bios) {
		this.bios = bios;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public Atividade[] getAtividade() {
		return atividade;
	}
	
	public void setAtividade(Atividade[] atividade) {
		this.atividade = atividade;
	}
	
	public void cadastrarPerfil() {
		/* Inserir no banco este Perfil */
	}
	
	public void alterarPerfil() {
		/* Atualizar no banco este Perfil */
	}
	
}
