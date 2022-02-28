package com.fabricio.designpatterns.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pokemon implements PokemonVisitable{

    private String nome;
    private String tipo;
    private Integer level;

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }

}
