package com.fabricio.designpatterns.visitor;

public class CamadaItemVisitor implements PokemonVisitor{

    private Integer levelTotal;
    private Integer quantidadeTotal;
    private Double valorTotal;

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println(pokemon.getNome());
    }

    @Override
    public void visit(Pokebola pokebola) {
        System.out.println(pokebola.getNome());
    }

    @Override
    public void visit(Fruta fruta) {
        System.out.println(fruta.getNome());
    }
}
