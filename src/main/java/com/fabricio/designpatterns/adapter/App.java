package com.fabricio.designpatterns.adapter;

public class App {

    public static void main(String[] args) {

        PokemonAntigo pokemonAntigo = new PokemonAntigo("Pikachu", "Choque do Trovão,Cauda De Ferro");

        Pokemon pokemon = new PokemonAdapter(pokemonAntigo);

        System.out.println(pokemon.getNome());
        System.out.println(pokemon.getTipo());
    }
}
