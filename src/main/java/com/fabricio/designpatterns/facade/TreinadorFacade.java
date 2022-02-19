package com.fabricio.designpatterns.facade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TreinadorFacade{
    private Pokemon pokemon;
    private Pokebola pokebola;

    public TreinadorFacade(Pokemon pokemon, Pokebola pokebola) {
        this.pokemon = pokemon;
        this.pokebola = pokebola;
    }

    public void detalhaItens(Pokemon pokemon, Pokebola pokebola){
        System.out.println("--------------------------------------------------------");
        System.out.println("O Treinador posssui um " + pokemon.getNome());
        System.out.println("do level " + pokemon.getLevel() + " e do tipo " + pokemon.getTipo());
        System.out.println("E possui " + pokebola.getQuantidade() + " " + pokebola.getNome());
        System.out.println("--------------------------------------------------------");
    }
}
