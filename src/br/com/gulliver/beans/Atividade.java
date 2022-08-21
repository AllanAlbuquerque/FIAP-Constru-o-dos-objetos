package br.com.gulliver.beans;

import java.util.ArrayList;

public class Atividade {
	private int id;
	private String titulo;
	private String descricao;
	private Endereco endereco;
	private ArrayList<Restaurante> restaurantes;
	private ArrayList<Hospedagem> hospedagens;
	private ArrayList<Imagem> imagens;
	private ArrayList<Avaliacao> avaliacoes;
	
	public Atividade() {
		super();
	}
	
	public Atividade(int id, String titulo, String descricao, Endereco endereco, ArrayList<Restaurante> restaurantes,
			ArrayList<Hospedagem> hospedagens, ArrayList<Imagem> imagens, ArrayList<Avaliacao> avaliacoes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.endereco = endereco;
		this.restaurantes = restaurantes;
		this.hospedagens = hospedagens;
		this.imagens = imagens;
		this.avaliacoes = avaliacoes;
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
	
	public Restaurante getRestaurante(int id) {
		return this.restaurantes.get(id);
	}
	
	public void setRestaurante(Restaurante restaurante) {
		this.restaurantes.set(this.restaurantes.size(), restaurante);
	}
	
	public Hospedagem getHospedagem(int id) {
		return this.hospedagens.get(id);
	}
	
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagens.set(this.hospedagens.size(), hospedagem);
	}
	
	public Imagem getImagem(int id) {
		return this.imagens.get(id);
	}
	
	public void setImagem(Imagem imagem) {
		this.imagens.set(imagens.size(), imagem);
	}
	
	public Avaliacao getAvaliacao(int id) {
		return this.avaliacoes.get(id);
	}
	
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacoes.set(avaliacoes.size(), avaliacao);
	}
	
	public void avaliar(int nota, String comentario) {
		ArrayList<Mensagem> novasMensagens = new ArrayList<Mensagem>();
		Mensagem mensagem = new Mensagem(1, comentario);
		novasMensagens.set(1, mensagem);
				
		/* Inserir no banco a nova mensagem */		
		Avaliacao novaAvaliacao = new Avaliacao(1, nota, novasMensagens);
		/* Inserir no banco a nova avaliacao */
		
	}
	
	public void cadastrarAtividade() {
		/* Inserir no banco esta atividade */
	}
	
	public void alterarAtividade() {
		/* Atualizar no banco esta atividade */
	}
	
	public void deletearAtividade() {
		/* Deletar no banco esta atividade */
	}
	
	public double buscarMediaDasAvaliacoes() {
		/* Buscar as media de avaliacoes dessa atividade */
		return 4.5;
	}
	
	public int buscarQntHospedagens() {
		/* Buscar a quantidade de hospedagens disponíveis pra essa atividade */
		return 4;
	}
	
	public int buscarQntRestaurantes() {
		/* Buscar a quantidade de restaurantes disponíveis pra essa atividade */
		return 8;
	}
	
}
