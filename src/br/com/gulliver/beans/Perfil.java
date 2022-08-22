package br.com.gulliver.beans;

import java.util.ArrayList;

public class Perfil {
	private int id;
	private String nome;
	private String bios;
	private String email;
	private Contato contato;
	private ArrayList<Atividade> atividades;
	
	public Perfil() {
		super();
	}
	
	public Perfil(int id, String nome, String bios, String email, Contato contato, ArrayList<Atividade> atividades) {
		super();
		this.id = id;
		this.nome = nome;
		this.bios = bios;
		this.email = email;
		this.contato = contato;
		this.atividades = atividades;
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
	
	public Atividade getAtividade(int id) {
		return this.atividades.get(id);
	}
	
	public ArrayList<Atividade> getAtividades() {
		return this.atividades;
	}
	
	public void setAtividade(Atividade atividade) {
		this.atividades.set(atividades.size(), atividade);
	}
	
	public void cadastrarPerfil() {
		/* Inserir no banco este Perfil */
	}
	
	public void alterarPerfil() {
		/* Atualizar no banco este Perfil */
	}
	
	public String toString() {
		return "Perfil[ id="+ this.getId()+", nome="+ this.getNome()+", email="+ this.getEmail()
		+", bios="+ this.getBios()+ ", contato= "+ this.getContato() +", atividades="+ this.getAtividades() +"]";
	}
	
}
