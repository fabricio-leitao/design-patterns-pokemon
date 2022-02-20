package com.fabricio.designpatterns.memento;

public class Originador {

    private String estado;

    public void setEstado(String estado) {
        System.out.println("Originador: Setando o estado para: " + estado);
        this.estado = estado;
    }

    public Memento salvandoNoMemento(){
        System.out.println("Originador: Salvando no memento.");
        return new Memento(estado);
    }

    public void restauradoDoMemento(Memento memento){
        System.out.println("Originador: Estado após a restauração do memento: " + estado);
        estado = memento.getEstadoSalvo();
    }
}
