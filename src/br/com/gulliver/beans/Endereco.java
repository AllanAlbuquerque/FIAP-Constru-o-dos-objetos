package br.com.gulliver.beans;

public class Endereco {
	private int cd_endereco;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private String pais;
	private String estado;
	
	public Endereco(int cd_endereco, String logradouro, String numero, String bairro, String cidade, String cep,
			String uf, String pais, String estado) {
		super();
		this.cd_endereco = cd_endereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.pais = pais;
		this.estado = estado;
	}

	public Endereco() {
		super();
	}

	public int getCd_endereco() {
		return cd_endereco;
	}

	public void setCd_endereco(int cd_endereco) {
		this.cd_endereco = cd_endereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	
}
