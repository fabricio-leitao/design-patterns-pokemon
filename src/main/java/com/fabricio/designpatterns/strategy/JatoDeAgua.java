package com.fabricio.designpatterns.strategy;

public class JatoDeAgua implements AtaqueStrategy{
    @Override
    public void Atacar() {
        System.out.println("Jato de água!!");
    }
}
