package com.fabricio.designpatterns.adapter;

import lombok.ToString;

@ToString
public class PokemonAdapter extends PokemonNovo implements Pokemon{

    private PokemonAntigo pokemonAntigo;

    public PokemonAdapter(PokemonAntigo pokemonAntigo) {
        this.pokemonAntigo = pokemonAntigo;
        this.adaptar();
    }

    private void adaptar(){
        this.setNome(pokemonAntigo.getNome());
        Tipo tipo = new Tipo();
        String[] tipoAntigo = pokemonAntigo.getTipo().split(",");
        tipo.setTipoPrincipal(tipoAntigo[0]);
        tipo.setTipoSecundario(tipoAntigo[1]);
        this.setTipo(tipo);
    }
}
