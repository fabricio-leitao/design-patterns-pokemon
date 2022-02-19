package com.fabricio.designpatterns.decorator;

import lombok.Getter;

@Getter
public abstract class PokemonDecorator implements Pokemon{

    private Pokemon pokemon;

    public PokemonDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public Integer informaLevel() {
        return pokemon.informaLevel();
    }

    @Override
    public String informaTipo() {
        return pokemon.informaTipo();
    }
}
