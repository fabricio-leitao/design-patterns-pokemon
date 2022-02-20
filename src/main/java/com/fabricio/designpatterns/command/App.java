package com.fabricio.designpatterns.command;

public class App {
    public static void main(String[] args) {

        ChamarPokemon chamarPokemon = new ChamarPokemon();
        Movimento movimento = new Movimento();
        Command ataque = new CommandAtacar(movimento);
        Command defenda = new CommandDefender(movimento);
        chamarPokemon.setCommand(ataque);
        chamarPokemon.arremessaPokebola();
        System.out.println();
        chamarPokemon.setCommand(defenda);
        chamarPokemon.arremessaPokebola();
    }
}
