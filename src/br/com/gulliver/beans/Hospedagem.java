package br.com.gulliver.beans;

public class Hospedagem {
	private int id;
	private String titulo;
	private String descricao;
	private Endereco endereco;
	private Imagem[] imagem;
	
	public Hospedagem() {
		super();
	}
	
	public Hospedagem(int id, String titulo, String descricao, Endereco endereco, Imagem[] imagem) {
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Imagem[] getImagem() {
		return imagem;
	}

	public void setImagem(Imagem[] imagem) {
		this.imagem = imagem;
	}
	
	public void cadastrarHospedagem() {
		/* Inserir no banco esta Hospedagem */
	}
	
	public void alterarHospedagem() {
		/* Atualizar no banco esta Hospedagem */
	}
	
	public void deletearHospedagem() {
		/* Deletar no banco esta Hospedagem */
	}
	
}
