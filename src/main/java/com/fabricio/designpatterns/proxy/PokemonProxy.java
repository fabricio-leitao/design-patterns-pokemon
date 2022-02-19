package com.fabricio.designpatterns.proxy;

public class PokemonProxy implements PokemonInterface{
    private Pokemon pokemon;
    private String nome;

    public PokemonProxy(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        if (pokemon == null){
            System.out.println("O Ataque vai precisar ser carregado!!!");
            pokemon = new Pokemon(nome);
        } else {
            System.out.println("Lá vem o ataque!!");
        }

        pokemon.atacar();
    }
}
