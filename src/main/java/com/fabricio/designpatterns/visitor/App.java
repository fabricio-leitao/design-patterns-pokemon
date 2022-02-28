package com.fabricio.designpatterns.visitor;

public class App {
    public static void main(String[] args) {
        Item item = new Item();

        Pokemon pokemon = new Pokemon();
        pokemon.setNome("Pikachu");
        pokemon.setLevel(15);
        pokemon.setTipo("Eletrico");

        Pokebola pokebola = new Pokebola();
        pokebola.setNome("GreatBall");
        pokebola.setQuantidade(10);

        Fruta fruta = new Fruta();
        fruta.setNome("BlueBerry");
        fruta.setValor(24.00);

        item.getItems().add(pokebola);
        item.getItems().add(pokemon);
        item.getItems().add(fruta);

        for (PokemonVisitable i : item.getItems()){
            System.out.println(i);
        }
    }
}
