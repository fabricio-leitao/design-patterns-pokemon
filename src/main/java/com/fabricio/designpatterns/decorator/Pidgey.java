package com.fabricio.designpatterns.decorator;

public class Pidgey implements Pokemon{
    @Override
    public Integer informaLevel() {
        return 5;
    }

    @Override
    public String informaTipo() {
        return "Voador";
    }
}
