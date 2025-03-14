package br.edu.fatecpg.abstracao.model;

public class ArteDigital {
    public String nomeObra;
    public String artista;
    public String estilo;

    public ArteDigital(String nomeObra, String artista, String estilo) {
        this.nomeObra = nomeObra;
        this.artista = artista;
        this.estilo = estilo;
    }

    public void exibirDetalhes() {
        System.out.println("Obra: " + nomeObra + " | Artista: " + artista + " | Estilo: " + estilo);
    }

    public void editarObra(String novaVersao) {
        System.out.println("Editando a obra " + nomeObra + " para a versão: " + novaVersao);
        this.nomeObra = novaVersao;
    }

    public void compartilhar() {
        System.out.println("A obra '" + nomeObra + "' de " + artista + " foi compartilhada online!");
    }

    
}