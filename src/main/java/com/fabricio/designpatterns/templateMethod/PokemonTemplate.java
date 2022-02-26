package com.fabricio.designpatterns.templateMethod;

public abstract class PokemonTemplate {

    protected void nome(){
        System.out.println("Pokemon Genérico");
    }

    protected void tipo(){
        System.out.println("Tipo Genérico");
    }

    protected void ataque(){
        System.out.println("Ataque Genérico");
    }

    protected abstract void level();

    public final void product(){
        nome();
        System.out.println("-----------------------");
        tipo();
        System.out.println("-----------------------");
        ataque();
        System.out.println("-----------------------");
        level();
    }
}
