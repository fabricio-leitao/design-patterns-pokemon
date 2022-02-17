package com.fabricio.designpatterns.factoryMethod;

public class PokemonFactory {

    public static Pokemon createPokemon(PokemonEnum number){
        return number.getPokemon();
    }
}
