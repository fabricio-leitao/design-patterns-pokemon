package com.fabricio.designpatterns.mediator;

public abstract class Pokemon {

    protected Mediator mediator;

    protected String name;

    public Pokemon(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void darOrdem(String comando);

    abstract void receberOrdem(String comando);
}
