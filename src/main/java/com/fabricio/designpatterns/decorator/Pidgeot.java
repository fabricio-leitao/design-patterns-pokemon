package com.fabricio.designpatterns.decorator;

public class Pidgeot extends PokemonDecorator{
    public Pidgeot(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public Integer informaLevel() {
        return super.informaLevel() + 31;
    }

    @Override
    public String informaTipo() {
        return super.informaTipo() + ", Mega, Normal";
    }
}
