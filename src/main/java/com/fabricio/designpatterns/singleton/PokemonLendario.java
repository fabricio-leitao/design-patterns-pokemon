package com.fabricio.designpatterns.singleton;

public class PokemonLendario extends Pokemon{

    private static PokemonLendario pokemonLendario;

    private PokemonLendario(String nome){
        this.setNome(nome);
        System.out.println("O pokemon lendário é: " + this.getNome());
    }

    public static PokemonLendario getSingletonInstance(String nome){
        if (pokemonLendario == null){
            pokemonLendario = new PokemonLendario(nome);
        }
        else {
            System.out.println("Só se pode existir um único pokemon lendário!");
        }
        return pokemonLendario;
    }

}
