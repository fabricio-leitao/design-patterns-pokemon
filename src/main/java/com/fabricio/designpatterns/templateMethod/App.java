package com.fabricio.designpatterns.templateMethod;

public class App {
    public static void main(String[] args) {

        PokemonTemplate template = new Pikachu();
        template.product();

        template = new Raichu();
        template.product();
    }
}
