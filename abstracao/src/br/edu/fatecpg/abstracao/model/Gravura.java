package br.edu.fatecpg.abstracao.model;

public class Gravura {

    String tipo;
    double tamanho;
    String dataCriacao;

    public Gravura(String tipo, double tamanho, String dataCriacao) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.dataCriacao = dataCriacao;
    }

   
    public void exibirDetalhes() {
        System.out.println("Gravura: " + tipo + " | Tamanho: " + tamanho + " cm | Data de Criação: " + dataCriacao);
    }

    
    public void analisarTecnica() {
        System.out.println("A técnica utilizada para esta gravura é " + tipo + ".");
    }

   
    public void verificarEstado() {
        System.out.println("A gravura está em ótimo estado de conservação.");
    }
}

