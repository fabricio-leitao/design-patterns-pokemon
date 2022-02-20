package com.fabricio.designpatterns.flyweight;

public class App {
    public static void main(String[] args) {

        PokemonFlyWeight pichu = PokemonFlyWeightFactory.getPokemon("pikachu key1");
        pichu.comparacao("pikachu");
        PokemonFlyWeight pikachu = PokemonFlyWeightFactory.getPokemon("pikachu key2");
        pikachu.comparacao("raichu");
        PokemonFlyWeight raichu = PokemonFlyWeightFactory.getPokemon("pikachu key1");
        raichu.comparacao("pichu");
    }
}
