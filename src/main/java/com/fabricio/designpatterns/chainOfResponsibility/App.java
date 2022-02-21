package com.fabricio.designpatterns.chainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Pichu pichu = new Pichu();
        Pikachu pikachu = new Pikachu();
        Raichu raichu = new Raichu();


        pokemon.sucessor = pichu;
        pichu.sucessor = pikachu;
        pikachu.sucessor = raichu;
        raichu.sucessor = null;

        pokemon.handleRequest(25);
    }
}
