package com.fabricio.designpatterns.templateMethod;

public class Raichu extends PokemonTemplate{

    @Override
    protected void nome() {
        System.out.println("Raichu");
    }

    @Override
    protected void tipo() {
        System.out.println("Tipo Elétrico");
    }

    @Override
    protected void level() {
        System.out.println("Level 30");
    }
}
