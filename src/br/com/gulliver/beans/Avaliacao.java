package br.com.gulliver.beans;

import java.util.ArrayList;

public class Avaliacao {
	private int id;
	private int nota;
	private ArrayList<Mensagem> mensagens;
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(int id, int nota, ArrayList<Mensagem> mensagens) {
		super();
		this.id = id;
		this.nota = nota;
		this.mensagens = mensagens;
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
	
	public Mensagem getMensagem(int id) {
		return this.mensagens.get(id);
	}
	
	public void setMensagem(Mensagem mensagem) {
		this.mensagens.set(mensagens.size(), mensagem);
	}
	
	public void comentar(String comentario) {
		Mensagem novaMensagem = new Mensagem();
		novaMensagem.setMensagem(comentario);
		
		/* Inserir no banco nova mensagem para esta avaliação*/
		
	}
}
