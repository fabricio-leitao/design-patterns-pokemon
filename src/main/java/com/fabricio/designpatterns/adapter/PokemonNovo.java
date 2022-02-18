package com.fabricio.designpatterns.adapter;

import lombok.Setter;

@Setter
public class PokemonNovo implements Pokemon{

    private String nome;
    private Tipo tipo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }

}
