package br.com.gulliver.beans;

public class Atividade {
	private int id;
	private String titulo;
	private String descricao;
	private Endereco endereco;
	private Restaurante[] restaurante;
	private Hospedagem[] hospedagem;
	private Imagem[] imagem;
	private Avaliacao[] avaliacao;
	
	public Atividade() {
		super();
	}
	
	public Atividade(int id, String titulo, String descricao, Endereco endereco, Restaurante[] restaurante,
			Hospedagem[] hospedagem, Imagem[] imagem, Avaliacao[] avaliacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.endereco = endereco;
		this.restaurante = restaurante;
		this.hospedagem = hospedagem;
		this.imagem = imagem;
		this.avaliacao = avaliacao;
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
	
	public Restaurante[] getRestaurante() {
		return restaurante;
	}
	
	public void setRestaurante(Restaurante[] restaurante) {
		this.restaurante = restaurante;
	}
	
	public Hospedagem[] getHospedagem() {
		return hospedagem;
	}
	
	public void setHospedagem(Hospedagem[] hospedagem) {
		this.hospedagem = hospedagem;
	}
	
	public Imagem[] getImagem() {
		return imagem;
	}
	
	public void setImagem(Imagem[] imagem) {
		this.imagem = imagem;
	}
	
	public Avaliacao[] getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(Avaliacao[] avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void avaliar(int nota, String comentario) {
		Mensagem novaMensagem[] = new Mensagem[0];
		novaMensagem[0].setMensagem(comentario);
				
		/* Inserir no banco a nova mensagem */
		int idMensagem = 1; //ID criado pelo banco
		
		Avaliacao novaAvaliacao = new Avaliacao(idMensagem, nota, novaMensagem);
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
