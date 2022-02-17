package com.fabricio.designpatterns.builder;

public enum Tipo {
    AGUA, FOGO, PLANTA;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
