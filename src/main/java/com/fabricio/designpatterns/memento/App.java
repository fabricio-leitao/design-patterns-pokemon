package com.fabricio.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Memento> estadosSalvos = new ArrayList<>();
        Originador originador = new Originador();
        originador.setEstado("Pichu");
        originador.setEstado("Pikachu");
        estadosSalvos.add(originador.salvandoNoMemento());
        originador.setEstado("Raichu");
        estadosSalvos.add(originador.salvandoNoMemento());
        originador.restauradoDoMemento(estadosSalvos.get(1));
        originador.restauradoDoMemento(estadosSalvos.get(0));
    }
}
