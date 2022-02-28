package com.fabricio.designpatterns.visitor;

public interface PokemonVisitable {
    void accept(PokemonVisitor visitor);
}
