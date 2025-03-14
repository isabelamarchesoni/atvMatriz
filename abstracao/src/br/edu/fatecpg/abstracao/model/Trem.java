package br.edu.fatecpg.abstracao.model;

public class Trem {
    public String tipo;
    public double velocidade;
    public String destino;

    public void mostrarTipo() {
        System.out.println("O tipo do trem é: " + tipo);
    }

    public void mostrarVelocidade() {
        System.out.println("A velocidade do trem é: " + velocidade + " km/h");
    }

    public void mostrarDestino() {
        System.out.println("O destino do trem é: " + destino);
    }
}