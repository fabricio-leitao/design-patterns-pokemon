package com.fabricio.designpatterns.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pokebola implements PokemonVisitable{

    private String nome;
    private Integer quantidade;

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
