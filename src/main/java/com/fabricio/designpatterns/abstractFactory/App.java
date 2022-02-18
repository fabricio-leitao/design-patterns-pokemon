package com.fabricio.designpatterns.abstractFactory;

public class App {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        PokemonFactory charizard = new CharizardFactory();
        pokemon.setAtaque(charizard.declararAtaque());
        pokemon.setTipo(charizard.declararTipo());

        System.out.println(pokemon);

        PokemonFactory blastoise = new BlastoiseFactory();
        pokemon.setTipo(blastoise.declararTipo());
        pokemon.setAtaque(blastoise.declararAtaque());

        System.out.println(pokemon);
    }
}
