package com.fabricio.designpatterns.state;

public class PokemonForte implements PokemonState{
    @Override
    public void atacar() {
        System.out.println("Seu pokemon teve um ataque efetivo!");
    }

    @Override
    public void defender() {
        System.out.println("Boa defesa! Agora ataque!!");
    }

    @Override
    public void fugir() {
        System.out.println("Não seja covarde e vá pra cima dele!");
    }
}
