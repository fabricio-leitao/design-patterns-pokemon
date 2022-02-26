package com.fabricio.designpatterns.observer;

public class Pokedex implements Observer{

    private String capturado;
    private Subject pokemon;

    public Pokedex(Subject pokemon, String capturado) {
        this.pokemon = pokemon;
        this.capturado = capturado;
        pokemon.registraObserver(this);
    }

    @Override
    public void update(String pokemon) {
        System.out.println("O pokémon " + capturado + " foi adicionado a sua pokedex.");
    }
}
