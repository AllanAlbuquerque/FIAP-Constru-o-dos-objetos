package br.com.gulliver.beans;

public class Contato {
	private int id;
	private int telefone;
	private String twitter;
	private String facebook;
	private String instagram;
	
	public Contato(int id, int telefone, String twitter, String facebook, String instagram) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.twitter = twitter;
		this.facebook = facebook;
		this.instagram = instagram;
	}

	public Contato() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
}
