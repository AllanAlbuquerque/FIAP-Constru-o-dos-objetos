package br.com.gulliver.beans;

public class Avaliacao {
	private int id;
	private int nota;
	private Mensagem[] mensagem;
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(int id, int nota, Mensagem[] mensagem) {
		super();
		this.id = id;
		this.nota = nota;
		this.mensagem = mensagem;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public Mensagem getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}		
}
