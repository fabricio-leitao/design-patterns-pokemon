package com.fabricio.designpatterns.factoryMethod;

public class App {
    public static void main(String[] args) {

        Pokemon bulbasaur = PokemonFactory.createPokemon(PokemonEnum.BULBASAUR);
        Pokemon charmander = PokemonFactory.createPokemon(PokemonEnum.CHARMANDER);
        Pokemon squirtle = PokemonFactory.createPokemon(PokemonEnum.SQUIRTLE);
        Pokemon pikachu = PokemonFactory.createPokemon(PokemonEnum.PIKACHU);

        System.out.println(bulbasaur.getName());
        System.out.println(charmander.getName());
        System.out.println(squirtle.getName());
        System.out.println(pikachu.getName());
    }
}
