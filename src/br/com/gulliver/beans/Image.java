package br.com.gulliver.beans;

public class Image {
	private int cd_image;
	private String descricao;
	private String titulo;
	private String path;
	
	public Image(int cd_image, String descricao, String titulo, String path) {
		super();
		this.cd_image = cd_image;
		this.descricao = descricao;
		this.titulo = titulo;
		this.path = path;
	}

	public Image() {
		super();
	}

	public int getCd_image() {
		return cd_image;
	}

	public void setCd_image(int cd_image) {
		this.cd_image = cd_image;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
