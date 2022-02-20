package com.fabricio.designpatterns.state;

public class App {
    public static void main(String[] args) {

        Treinador treinador = new Treinador();
        treinador.lancarPokemonForte();
        treinador.atacar();
        treinador.defender();
        treinador.fugir();
        System.out.println("------------------------");
        treinador.lancarPokemonFraco();
        treinador.atacar();
        treinador.defender();
        treinador.fugir();
    }
}
