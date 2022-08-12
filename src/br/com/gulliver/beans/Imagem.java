package br.com.gulliver.beans;

public class Imagem {
	private String id;
	private String url;
	private String descricao;
	
	public Imagem() {
		super();
	}
	
	public Imagem(String id, String url, String descricao) {
		super();
		this.id = id;
		this.url = url;
		this.descricao = descricao;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
