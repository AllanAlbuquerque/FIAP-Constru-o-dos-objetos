package br.com.gulliver.inicio;

import br.com.gulliver.beans.Atividade;
import br.com.gulliver.beans.Avaliacao;
import br.com.gulliver.beans.Contato;
import br.com.gulliver.beans.Endereco;
import br.com.gulliver.beans.Hospedagem;
import br.com.gulliver.beans.Imagem;
import br.com.gulliver.beans.Mensagem;
import br.com.gulliver.beans.Perfil;
import br.com.gulliver.beans.Restaurante;
import br.com.gulliver.beans.Usuario;

public class Inicio {

	public static void main(String[] args) {
		/* Criar imagem exemplo */
		Imagem imagem = new Imagem(1, "/src/img/restaurante.jpg", "Restaurante abc");
		imagem.cadastrarImagem();
		
		/* ******************************* */
		
		/* Criar endereco exemplo */
		Endereco endereco = new Endereco();
		endereco.setId(1);
		endereco.setLogradouro("Rua 25 de Marco");
		endereco.setNumero(1);
		endereco.setBairro("Centro");
		endereco.setCep(321123);
		endereco.setUf("SP");
		endereco.setPais("Brasil");
		endereco.setCidade("Sao Paulo");
		
		/* ******************************* */
		
		/* Criar mensagem exemplo */
		Mensagem mensagem = new Mensagem(1, "Melhor experiencia da minha vida");
		
		/* ******************************* */
		
		/* Criar Avaliacao exemplo */
		/* Uma avaliacao pode ter varias mensagens entao criamos um array */
		Mensagem mensagens[] = new Mensagem[1];
		mensagens[0] = mensagem; //Primeiro item é a nossa mensagem.
		
		//A nova avaliacao recebe nossa lista de mensagem
		Avaliacao avaliacao = new Avaliacao(1, 5, mensagens);
		
		/* ******************************* */
		
		/* Criar Restaurante exemplo */
		/* Um restaurante pode ter diversas imagens */
		Imagem imagensRestaurante[] = new Imagem[1];
		imagensRestaurante[0] = imagem;
		
		Restaurante restaurante = new Restaurante(1,
				"Restaurante A",
				"Restaurante com preco popular",
				endereco,
				imagensRestaurante);
		
		/* Criar Hospedagem exemplo */
		/* Uma hospefagem pode ter diversas imagens */
		Imagem imagensHospedagem[] = new Imagem[1];
		imagensHospedagem[0] = imagem;
		
		Hospedagem hospedagem = new Hospedagem(1,
				"Hospedagem A",
				"Hospedagem tres estrelas",
				endereco,
				imagensHospedagem);
		
		/* Criar Atividade exemplo */
		/* Uma atividade pode ter varias imagens, restaurantes, 
		 * avaliacoes e hospedagens entao criamos um array */
		Imagem imagens[] = new Imagem[1];
		imagens[0] = imagem;
		
		Avaliacao avaliacoes[] = new Avaliacao[1];
		avaliacoes[0] = avaliacao;
		
		Restaurante restaurantes[] = new Restaurante[1];
		restaurantes[0] = restaurante;
		
		Hospedagem hospedagens[] = new Hospedagem[1];
		hospedagens[0] = hospedagem;
		
		Atividade atividade = new Atividade();
		atividade.setId(1);
		atividade.setTitulo("Excursao");
		atividade.setDescricao("Excursao do ponta A ao ponto B");
		atividade.setEndereco(endereco);
		atividade.setRestaurante(restaurantes);
		atividade.setHospedagem(hospedagens);
		atividade.setImagem(imagens);
		atividade.setAvaliacao(avaliacoes);
		
		/* Criar Contato exemplo */
		Contato contato = new Contato(1, 1199999999, "abc", "bcd", "efg");
		
		/* Criar Perfil exemplo */
		/* Um perfil pode ter varias atividades entao criamos um array */
		Atividade atividades[] = new Atividade[1];
		atividades[0] = atividade;
		
		Perfil perfil = new Perfil(1,
				"nomeUser",
				"breve descricao",
				"a@email.com",
				contato,
				atividades);
		
		/* Criar Usuario exemplo */
		Usuario usuario = new Usuario(1,
				"a@a.com",
				"1234",
				perfil);
		
		usuario.logarUsuario();
	}

}
