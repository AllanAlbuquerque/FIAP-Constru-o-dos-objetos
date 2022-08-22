package br.com.gulliver.inicio;

import java.util.ArrayList;
import java.util.HashSet;

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
		
		System.out.println( endereco.toString() );
		
		/* ******************************* */
		
		/* Criar atividade exemplo */
		Atividade atividade = new Atividade();
		atividade.setId(1);
		atividade.setTitulo("Excursao");
		atividade.setDescricao("Excursao do ponta A ao ponto B");
		atividade.setEndereco(endereco);
		
		System.out.println( atividade );
		
		/* ******************************* */
		
		/* Criar Contato exemplo */
		Contato contato = new Contato(1, 1199999999, "abc", "bcd", "efg");
		
		System.out.println(contato);
		/* ******************************* */
				
		/* Criar imagem para atividade, restaurante e hospedagem exemplo */
		Imagem imagemAtividade01 = new Imagem(1, "/src/img/atividade1.jpg", "Atividade abc");
		imagemAtividade01.cadastrarImagem();
		Imagem imagemAtividade02 = new Imagem(2, "/src/img/atividade2.jpg", "Atividade abc");
		imagemAtividade02.cadastrarImagem();
		
		Imagem imagemRestaurante = new Imagem(1, "/src/img/restaurante.jpg", "Restaurante abc");
		imagemRestaurante.cadastrarImagem();
		
		Imagem imagemHospedagem = new Imagem(2, "/src/img/hospedagem.jpg", "Hospedagem abc");
		imagemHospedagem.cadastrarImagem();
		
		/* ******************************* */
		
		/* Criar Restaurante  exemplo */
		/* Um restaurante pode ter diversas imagens  com um endereco*/
		ArrayList<Imagem> imagensRestaurante = new ArrayList<Imagem>();
		imagensRestaurante.add(imagemRestaurante);
		
		Restaurante restaurante = new Restaurante(1,
				"Restaurante A",
				"Restaurante com preco popular",
				endereco,
				imagensRestaurante);
		
		System.out.println(restaurante);
		
		/* ******************************* */
		
		/* Criar Hospedagem exemplo */
		/* Uma hospefagem pode ter diversas imagens  com um endereco*/
		ArrayList<Imagem> imagensHospedagem = new ArrayList<Imagem>();
		imagensHospedagem.add(imagemHospedagem);
		
		Hospedagem hospedagem = new Hospedagem(1,
				"Hospedagem A",
				"Hospedagem tres estrelas",
				endereco,
				imagensHospedagem);
		
		System.out.println(hospedagem);
		
		/* ******************************* */
		
		/* Criar mensagem exemplo */
		Mensagem mensagem1= new Mensagem(1, "Melhor experiencia da minha vida");
		Mensagem mensagem2 = new Mensagem(2, "seila man. Não faço ideias.");
		System.out.println(mensagem1);
		System.out.println(mensagem2);
		
		/* ******************************* */

		/* Criar Avaliacao exemplo */
		/* Uma avaliacao pode ter varias mensagens entao criamos um array */
		ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
		mensagens.add( mensagem1); //Primeiro item é a nossa mensagem.
		mensagens.add( mensagem2); //segunda item é a nossa mensagem.
		
		System.out.println(mensagens);
		
		/* ******************************* */
		
		//A nova avaliacao recebe nossa lista de mensagem
		Avaliacao avaliacao = new Avaliacao(1, 5, mensagens);
		
		System.out.println(avaliacao);
		
		/* ******************************* */
		
		/* avaliacoes, restaurantes e hospedagens entao criamos um array */
		
		HashSet<Avaliacao> avaliacoes = new HashSet<Avaliacao>();
		avaliacoes.add(avaliacao);
		avaliacoes.add(avaliacao);
		avaliacoes.add(avaliacao);
		avaliacoes.add(avaliacao);
		
		HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();
		restaurantes.add(restaurante);
		restaurantes.add(restaurante);
		restaurantes.add(restaurante);
		
		
		HashSet<Hospedagem> hospedagens = new HashSet<Hospedagem>();
		hospedagens.add(hospedagem);
		hospedagens.add(hospedagem);
		hospedagens.add(hospedagem);
		/* ******************************* */
		
		/* Uma atividade pode ter varias imagens, restaurantes e avaliacao, */
		
		HashSet<Imagem> imagens = new HashSet<Imagem>();
		imagens.add(imagemAtividade01);
		imagens.add(imagemAtividade01);
		imagens.add(imagemAtividade01);
		imagens.add(imagemAtividade02);
		imagens.add(imagemAtividade02);
		imagens.add(imagemAtividade02);
		
		System.out.println(imagens);
		
		for(Imagem img:imagens) {
			atividade.setImagem(img);
		}
		
		System.out.println(atividade);
		
		for(Restaurante r:restaurantes) {
			atividade.setRestaurante(r);
		}
		
		System.out.println(atividade);
		
		for(Hospedagem h:hospedagens) {
			atividade.setHospedagem(h);
		}
		
		System.out.println(atividade);
		
		
		for(Avaliacao v:avaliacoes) {
			atividade.setAvaliacao(v);
		}
		
		System.out.println(atividade);
		

		/* ******************************* */
		
		/* Criar Perfil exemplo */
		/* Um perfil pode ter varias atividades entao criamos um array */
		ArrayList<Atividade> atividades = new ArrayList<Atividade>();
		atividades.add(atividade);
		
		Perfil perfil = new Perfil(
				1,
				"nomeUser",
				"breve descricao",
				"a@email.com",
				contato,
				atividades
		);
		
		System.out.println( perfil );
		
		/* ******************************* */
		
		/* Criar Usuario exemplo */
		Usuario usuario = new Usuario(1,
				"a@a.com",
				"1234",
				perfil);
		
		usuario.logarUsuario();
		
		System.out.println( usuario );
	
		
	}

}
