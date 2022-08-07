package br.com.gulliver.beans;

public class Avaliacao {
	private int Id;
	private float nota;
	
	public Avaliacao(int id, float nota) {
		super();
		Id = id;
		this.nota = nota;
	}
	
	public Avaliacao() {
		super();
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
}
