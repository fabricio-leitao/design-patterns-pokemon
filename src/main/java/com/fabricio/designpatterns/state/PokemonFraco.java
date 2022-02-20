package com.fabricio.designpatterns.state;

public class PokemonFraco implements PokemonState{
    @Override
    public void atacar() {
        System.out.println("É melhor fugir!");
    }

    @Override
    public void defender() {
        System.out.println("Sua defesa não vai resistir!");
    }

    @Override
    public void fugir() {
        System.out.println("òtima escolha o adversário era forte!");
    }
}
