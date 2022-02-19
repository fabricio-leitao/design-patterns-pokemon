package com.fabricio.designpatterns.bridge;

public class AtaqueAntigoAgua implements Ataque{
    @Override
    public void atacar() {
        System.out.println("Ataque de bolhas!");
    }
}
