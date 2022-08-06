package br.com.gulliver.inicio;

import br.com.gulliver.beans.Atracao;

public class Inicio {

	public static void main(String[] args) {
		Atracao atracao = new Atracao();
		atracao.setNome("Tour no RJ");
		atracao.setDescricao("Uma volta pelos principais pontos turísticos do Rio de Janeiro");
		System.out.println(atracao.getNome() + "\n" + atracao.getDescricao());
	}

}
