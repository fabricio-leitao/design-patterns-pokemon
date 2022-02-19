package com.fabricio.designpatterns.bridge;

public class AtaqueNovoAgua implements Ataque{
    @Override
    public void atacar() {
        System.out.println("Jato de água!");
    }
}
