package com.fabricio.designpatterns.bridge;

public abstract class Pokemon {
    Ataque ataque;

    public Pokemon(Ataque ataque) {
        this.ataque = ataque;
    }

    abstract void nome();
}
