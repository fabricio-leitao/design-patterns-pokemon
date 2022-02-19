package com.fabricio.designpatterns.bridge;

public class Squirtle extends Pokemon{
    private Ataque ataque;

    public Squirtle(Ataque ataque) {
        super(ataque);
        this.ataque = ataque;
    }

    @Override
    void nome() {
        System.out.println("Squirtle eu escolho você!");
    }
}
