package com.fabricio.designpatterns.mediator;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class PokemonMediatorImpl implements Mediator{

    private List<Pokemon> pokemons;

    public PokemonMediatorImpl() {
        pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    @Override
    public void darOrdem(Pokemon pokemon, String comando) {

        for (Pokemon p : this.pokemons){
            if (p != pokemon){
                p.receberOrdem(comando);
            }
        }
    }
}
