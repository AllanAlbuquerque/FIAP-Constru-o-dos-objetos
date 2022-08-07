package br.com.gulliver.beans;

public class Comentario {
	private int id;
	private String mensagem;
	
	public Comentario(int id, String mensagem) {
		super();
		this.id = id;
		this.mensagem = mensagem;
	}
	
	public Comentario() {
		super();
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
