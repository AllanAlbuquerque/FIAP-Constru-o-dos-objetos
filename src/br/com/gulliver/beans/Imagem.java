package br.com.gulliver.beans;

public class Imagem {
	private int id;
	private String url;
	private String descricao;
	
	public Imagem() {
		super();
	}
	
	public Imagem(int id, String url, String descricao) {
		super();
		this.id = id;
		this.url = url;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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
	
	public void cadastrarImagem() {
		/* Inserir no banco esta imagem */
	}
	
	public void deletarImagem() {
		/* Deletar no banco esta imagem */
	}
	
	public String toString() {
		return "Imagem[id="+ this.getId() +", url="+ this.getUrl() + ", descricao="+this.getDescricao() +"]";
	}
}
