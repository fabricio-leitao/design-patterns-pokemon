package com.fabricio.designpatterns.builder;

public class App {
    public static void main(String[] args){

        Pokemon arcanine = new Pokemon.PokemonBuilder(Tipo.FOGO, AtaquePrincipal.INVESTIDA)
                .withNome("Arcanine")
                .withSexo("masculino")
                .withLevel("18")
                .build();

        System.out.println(arcanine);
    }
}
