package com.fabricio.designpatterns.observer;

public class App {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();

        Pokedex pikachu = new Pokedex(pokemon, "Pikachu");
        Pokedex raichu = new Pokedex(pokemon, "Raichu");
        Pokedex charmander = new Pokedex(pokemon, "Charmander");
        Pokedex pichu = new Pokedex(pokemon, "Pichu");

        pokemon.setPokemon("Pokemons Capturados!!");
    }
}
