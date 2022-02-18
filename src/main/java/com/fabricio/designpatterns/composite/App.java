package com.fabricio.designpatterns.composite;

public class App {

    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon("Pikachu");
        Ataque ataque = new Ataque("Choque do trovão");
        Ataque ataque2 = new Ataque("Cauda de Ferro");
        Tipo tipo = new Tipo("Elétrico");

        pokemon.adicionaAtaque(ataque);
        pokemon.adicionaAtaque(ataque2);
        pokemon.adicionaTipo(tipo);

        System.out.println(pokemon);

        pokemon.removeAtaque(ataque);

        System.out.println("--------------------");
        System.out.println(pokemon);
    }
}
