package com.fabricio.designpatterns.iterator;

public class Pokedex implements PokemonIterable{

    private Pokemon[] pokedex;

    public Pokedex() {
        pokedex = new Pokemon[4];
        pokedex[0] = new Pokemon("Pikachu", "eletrico", 15);
        pokedex[1] = new Pokemon("Bulbasaur", "planta", 16);
        pokedex[2] = new Pokemon("Charmander", "fogo", 14);
        pokedex[3] = new Pokemon("Squirtle", "agua", 17);
    }

    public Pokemon[] getPokedex() {
        return pokedex;
    }

    @Override
    public Iterator iterator() {
        return new PokedexIterator(pokedex);
    }
}
