package com.fabricio.designpatterns.proxy;

public class Pokemon implements PokemonInterface{
    private String nome;

    public Pokemon(String nome) {
        this.nome = nome;
        carregandoOAtaque(nome);
    }


    @Override
    public void atacar() {
        System.out.println( nome + " usou o Raio Solar!");
    }

    public void carregandoOAtaque(String nome){
        System.out.println(nome + " está carregando o ataque!");
    }
}
