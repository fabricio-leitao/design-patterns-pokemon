package com.fabricio.designpatterns.abstractFactory;

public class Pokemon{

    private Tipo tipo;
    private Ataque ataque;

    public Pokemon() {
    }

    public Pokemon(Tipo tipo, Ataque ataque) {
        this.tipo = tipo;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipo=" + tipo.getTipo() +
                ", ataque=" + ataque.getAtaque() +
                '}';
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
}
