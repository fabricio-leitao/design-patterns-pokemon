package com.fabricio.designpatterns.templateMethod;

public class Pikachu extends PokemonTemplate{

    @Override
    protected void nome() {
        System.out.println("Pikachu");
    }

    @Override
    protected void level() {
        System.out.println("Level 15");
    }
}
