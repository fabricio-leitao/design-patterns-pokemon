package com.fabricio.designpatterns.factoryMethod;

//Enum Strategy
public enum PokemonEnum {
    BULBASAUR(new Bulbasaur()),
    CHARMANDER(new Charmander()),
    SQUIRTLE(new Squirtle()),
    PIKACHU(new Pikachu());

    private Pokemon pokemon;

    PokemonEnum(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}
