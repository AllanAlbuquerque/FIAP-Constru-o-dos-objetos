package br.com.gulliver.beans;

public class Restaurante {
	private int id;
	private String nome;
	private String descricao;
	private Endereco endereco;
	private Imagem[] imagem;
	
	public Restaurante()  {
		super();
	}

	public Restaurante(int id, String nome, String descricao, Endereco endereco, Imagem[] imagem) {
		super();
		this.id = id;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void cadastrarRestaurante() {
		/* Inserir no banco esta Restaurante */
	}
	
	public void alterarRestaurante() {
		/* Atualizar no banco esta Restaurante */
	}
	
	public void deletearRestaurante() {
		/* Deletar no banco esta Restaurante */
	}

}
