package br.com.gulliver.beans;

public class Mensagem {
	private int id;
	private String mensagem;
	
	public Mensagem() {
		super();
	}
	
	public Mensagem(int id, String mensagem) {
		super();
		this.id = id;
		this.mensagem = mensagem;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
