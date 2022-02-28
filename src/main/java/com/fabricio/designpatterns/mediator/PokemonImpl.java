package com.fabricio.designpatterns.mediator;

import lombok.ToString;

@ToString
public class PokemonImpl extends Pokemon{
    public PokemonImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void darOrdem(String comando) {
        System.out.println(this.name + " ordena um(a) " + comando);
        this.mediator.darOrdem(this, comando);
    }

    @Override
    void receberOrdem(String comando) {
        System.out.println(this.name + " recebe uma ordem que é " + comando);
    }
}
