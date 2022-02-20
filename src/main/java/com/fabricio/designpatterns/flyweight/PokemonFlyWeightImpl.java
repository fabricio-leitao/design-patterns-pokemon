package com.fabricio.designpatterns.flyweight;

public class PokemonFlyWeightImpl implements PokemonFlyWeight{
    private String interno;

    public PokemonFlyWeightImpl(String interno) {
        this.interno = interno;
    }

    @Override
    public void comparacao(String externo) {
        System.out.println(interno + " : " + externo);
    }
}
