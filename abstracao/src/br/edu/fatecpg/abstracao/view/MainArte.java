package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.ArteDigital;

public class MainArte {

	public static void main(String[] args) {
        ArteDigital arte = new ArteDigital("Visões Futuristas", "Ana Souza", "Cyberpunk");
        arte.exibirDetalhes();
        arte.editarObra("Visões Futuristas - Versão 2.0");
        arte.compartilhar();
    }

}