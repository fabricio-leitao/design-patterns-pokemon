package com.fabricio.designpatterns.proxy;

public class App {
    public static void main(String[] args) {

        PokemonInterface bulbasaur = new PokemonProxy("Bulbasaur");

        bulbasaur.atacar();
        System.out.println();

        bulbasaur.atacar();
    }
}
