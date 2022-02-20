package com.fabricio.designpatterns.state;

public class Treinador {

    private PokemonState state;

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void lancarPokemonForte(){
        setState(new PokemonForte());
        System.out.println("Eu escolho você!!Pikachu");
    }

    public void lancarPokemonFraco(){
        setState(new PokemonFraco());
        System.out.println("Eu escolho você!! Magikarp");
    }

    public void atacar(){
        state.atacar();
    }

    public void defender(){
        state.defender();
    }

    public void fugir(){
        state.fugir();
    }
}
