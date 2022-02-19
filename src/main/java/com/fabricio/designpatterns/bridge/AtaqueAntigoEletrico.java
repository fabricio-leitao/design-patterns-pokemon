package com.fabricio.designpatterns.bridge;

public class AtaqueAntigoEletrico implements Ataque{
    @Override
    public void atacar() {
        System.out.println("Trovoada!");
    }
}
