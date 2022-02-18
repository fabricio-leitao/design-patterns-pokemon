package com.fabricio.designpatterns.composite;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Pokemon {

    private String nome;
    private List<Ataque> ataques;
    private List<Tipo> tipos;

    public Pokemon(String nome) {
        this.nome = nome;
        ataques = new ArrayList<>();
        tipos = new ArrayList<>();
    }

    public void adicionaAtaque(Ataque ataque){
        ataques.add(ataque);
    }
    public void removeAtaque(Ataque ataque){
        ataques.remove(ataque);
    }
    public void adicionaTipo(Tipo tipo){
        tipos.add(tipo);
    }
    public void removeTipo(Tipo tipo){
        tipos.remove(tipo);
    }
}
