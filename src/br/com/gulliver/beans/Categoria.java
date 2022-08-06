package br.com.gulliver.beans;

public class Categoria {
	private int cd_categoria;
	private String nome;
	private String descricao;
	private boolean fl_ativo;
	
	public Categoria(int cd_categoria, String nome, String descricao, boolean fl_ativo) {
		super();
		this.cd_categoria = cd_categoria;
		this.nome = nome;
		this.descricao = descricao;
		this.fl_ativo = fl_ativo;
	}
	
	public Categoria() {
		super();
	}
	
	public int getCd_categoria() {
		return cd_categoria;
	}
	
	public void setCd_categoria(int cd_categoria) {
		this.cd_categoria = cd_categoria;
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
	
	public boolean isFl_ativo() {
		return fl_ativo;
	}
	
	public void setFl_ativo(boolean fl_ativo) {
		this.fl_ativo = fl_ativo;
	}
}
