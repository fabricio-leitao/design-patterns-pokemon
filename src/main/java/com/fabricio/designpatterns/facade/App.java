package com.fabricio.designpatterns.facade;

public class App {
    public static void main(String[] args) {

        Pokebola masterBall = new Pokebola("Master Ball", 1);
        Pokemon magby = new Pokemon("Magby", 20, Tipo.FOGO);

        TreinadorFacade treinador = new TreinadorFacade();
        treinador.detalhaItens(magby, masterBall);
    }
}
