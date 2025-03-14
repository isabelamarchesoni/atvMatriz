package br.edu.fatecpg.abstracao.model;

public class Smartwatch {
    public String cor;
    public String modelo;
    public String marca;

    public void mostrarCor() {
        System.out.println("A cor do smartwatch é: " + cor);
    }

    public void mostrarModelo() {
        System.out.println("O modelo do smartwatch é: " + modelo);
    }

    public void mostrarMarca() {
        System.out.println("A marca do smartwatch é: " + marca);
    }
}