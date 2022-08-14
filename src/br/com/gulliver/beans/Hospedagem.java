package br.com.gulliver.beans;

public class Hospedagem {
	private int id;
	private int titulo;
	private int descricao;
	private Endereco[] endereco;
	private Imagem[] imagem;
	
	public Hospedagem() {
		super();
	}
	
	public Hospedagem(int id, int titulo, int descricao, Endereco[] endereco, Imagem[] imagem) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.endereco = endereco;
		this.imagem = imagem;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public Endereco[] getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco[] endereco) {
		this.endereco = endereco;
	}

	public int getDecricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

	public Imagem[] getImagem() {
		return imagem;
	}

	public void setImagens(Imagem[] imagem) {
		this.imagem = imagem;
	}
}
