package com.fabricio.designpatterns.memento;

public class Memento {

    private String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstadoSalvo() {
        return estado;
    }
}
