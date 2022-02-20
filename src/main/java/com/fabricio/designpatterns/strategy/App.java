package com.fabricio.designpatterns.strategy;

public class App {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        pokemon.setAtaqueStrategy(new LancaChamas());
        pokemon.usarAtaque();
        pokemon.setAtaqueStrategy(new FolhaNavalha());
        pokemon.usarAtaque();
        pokemon.setAtaqueStrategy(new JatoDeAgua());
        pokemon.usarAtaque();
    }
}
