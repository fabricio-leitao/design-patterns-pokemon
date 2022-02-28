package com.fabricio.designpatterns.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Fruta implements PokemonVisitable{

    private String nome;
    private double valor;

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
