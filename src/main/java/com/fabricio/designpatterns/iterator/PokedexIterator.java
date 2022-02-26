package com.fabricio.designpatterns.iterator;

public class PokedexIterator implements Iterator {

    private Pokemon[] pokedex;

    private int index;

    public PokedexIterator(Pokemon[] pokedex) {
        this.pokedex = pokedex;
    }

    @Override
    public boolean hasNext() {
        return (index < pokedex.length - 1 && pokedex[index] != null);
    }

    @Override
    public Object next() {
        return pokedex[index++];
    }
}
