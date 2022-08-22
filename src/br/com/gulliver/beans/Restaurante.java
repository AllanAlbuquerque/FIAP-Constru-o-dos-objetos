package br.com.gulliver.beans;

import java.util.ArrayList;

public class Restaurante {
	private int id;
	private String nome;
	private String descricao;
	private Endereco endereco;
	private ArrayList<Imagem> imagens;
	
	public Restaurante()  {
		super();
	}

	public Restaurante(int id, String nome, String descricao, Endereco endereco, ArrayList<Imagem> imagens) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.endereco = endereco;
		this.imagens = imagens;
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

	public Imagem getImagem(int id) {
		return this.imagens.get(id);
	}
	
	public ArrayList<Imagem> getImagens() {
		return this.imagens;
	}

	public void setImagem(Imagem imagem) {
		this.imagens.set(imagens.size(), imagem);
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
	
	public String toString() {
		return "Restaurante[id="+ this.getId() +", nome="+ this.getNome() + ", descricao="+this.getDescricao() +", endereco="+ this.getEndereco()+", imagens="+ this.getImagens() +"]";
	}

}
