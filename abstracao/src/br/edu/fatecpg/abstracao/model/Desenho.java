package br.edu.fatecpg.abstracao.model;

public class Desenho {

    String tipoMaterial;
    double dimensao; 
    String nivelDetalhe;

    public Desenho(String tipoMaterial, double dimensao, String nivelDetalhe) {
        this.tipoMaterial = tipoMaterial;
        this.dimensao = dimensao;
        this.nivelDetalhe = nivelDetalhe;
    }

    
    public void descreverDesenho() {
        System.out.println("Desenho feito com " + tipoMaterial + " | Dimensão: " + dimensao + " cm | Nível de Detalhe: " + nivelDetalhe);
    }

    
    public void apresentarDimensao() {
        System.out.println("Dimensão do desenho: " + dimensao + " cm");
    }

   
    public void adicionarDetalhes() {
        System.out.println("Detalhes adicionados ao desenho: " + nivelDetalhe);
    }
}