package br.edu.fatecpg.abstracao.model;

public class Roteador {
    public String marca;
    public String cor;
    public int quantidadeAntenas;

    public void mostrarMarca() {
        System.out.println("A marca do roteador é: " + marca);
    }

    public void mostrarCor() {
        System.out.println("A cor do roteador é: " + cor);
    }

    public void mostrarQuantidadeAntenas() {
        System.out.println("A quantidade de antenas do roteador é: " + quantidadeAntenas);
    }
}