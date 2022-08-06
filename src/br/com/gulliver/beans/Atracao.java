package br.com.gulliver.beans;

public class Atracao {
	private int cd_atracao;
	private String nome;
	private String descricao;
	private String fl_ativo;
	
	public Atracao(int cd_atracao, String nome, String descricao, String fl_ativo) {
		super();
		this.cd_atracao = cd_atracao;
		this.nome = nome;
		this.descricao = descricao;
		this.fl_ativo = fl_ativo;
	}

	public Atracao() {
		super();
	}

	public int getCd_atracao() {
		return cd_atracao;
	}

	public void setCd_atracao(int cd_atracao) {
		this.cd_atracao = cd_atracao;
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

	public String getFl_ativo() {
		return fl_ativo;
	}

	public void setFl_ativo(String fl_ativo) {
		this.fl_ativo = fl_ativo;
	}
	
}
