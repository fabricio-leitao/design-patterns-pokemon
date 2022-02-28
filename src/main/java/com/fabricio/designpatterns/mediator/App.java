package com.fabricio.designpatterns.mediator;

public class App {
    public static void main(String[] args) {

        PokemonMediatorImpl mediator = new PokemonMediatorImpl();
        Pokemon pokemon1 = new PokemonImpl(mediator, "Pikachu");
        Pokemon pokemon2 = new PokemonImpl(mediator, "Sandshrew");
        Pokemon pokemon3 = new PokemonImpl(mediator, "Typhlosion");

        mediator.addPokemon(pokemon1);
        mediator.addPokemon(pokemon2);
        mediator.addPokemon(pokemon3);

        pokemon3.darOrdem("Ataque");
        pokemon1.darOrdem("Defender");
    }
}
