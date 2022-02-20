package com.fabricio.designpatterns.strategy;

public class LancaChamas implements AtaqueStrategy{
    @Override
    public void Atacar() {
        System.out.println("Lança Chamas!!!");
    }
}
