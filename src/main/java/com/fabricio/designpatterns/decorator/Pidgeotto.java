package com.fabricio.designpatterns.decorator;

public class Pidgeotto extends PokemonDecorator{
    public Pidgeotto(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public Integer informaLevel() {
        return super.informaLevel()  + 13;
    }

    @Override
    public String informaTipo() {
        return super.informaTipo() + ", Normal";
    }
}
