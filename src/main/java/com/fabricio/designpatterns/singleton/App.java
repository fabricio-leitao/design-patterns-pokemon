package com.fabricio.designpatterns.singleton;

public class App {
    public static void main(String[] args){

        PokemonLendario mewtwo = PokemonLendario.getSingletonInstance("Mewtwo");
        PokemonLendario arceus = PokemonLendario.getSingletonInstance("Arceus");

        System.out.println(mewtwo.getNome());
        System.out.println(arceus.getNome());

    }
}
