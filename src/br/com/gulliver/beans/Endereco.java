package br.com.gulliver.beans;

public class Endereco {
	private int id;
	private String logradouro;
	private int numero;
	private String bairro;
	private int cep;
	private String uf;
	private String pais;
	private String cidade;
	
	public Endereco() {
		super();
	}
	
	public Endereco(int id, String logradouro, int numero, String bairro, int cep, String uf, String pais,
			String cidade) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.pais = pais;
		this.cidade = cidade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
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
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void cadastrarEndereco() {
		/* Inserir no banco este endereco */
	}
	
	public void alterarEndereco() {
		/* Atualizar no banco este endereco */
	}
	
	public String toString() {
		return "Endereco[id="+ this.getId() +", logradouro="+ this.getLogradouro() + ", numero="+this.getNumero() +", bairro="+ this.getBairro()+", cep="+ this.getCep() +", uf="+ this.getUf() +", pais="+ this.getPais() +", cidade="+ this.getCidade() +"]";
	}

}
