package com.fabricio.designpatterns.visitor;

public interface PokemonVisitor {
    void visit(Pokemon pokemon);
    void visit(Pokebola pokebola);
    void visit(Fruta fruta);
}
