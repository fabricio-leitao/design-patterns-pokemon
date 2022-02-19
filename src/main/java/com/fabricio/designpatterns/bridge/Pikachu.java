package com.fabricio.designpatterns.bridge;

public class Pikachu extends Pokemon{
    private Ataque ataque;

    public Pikachu(Ataque ataque) {
        super(ataque);
        this.ataque = ataque;
    }

    @Override
    void nome() {
        System.out.println("Pikachu eu escolho você!");
    }
}
