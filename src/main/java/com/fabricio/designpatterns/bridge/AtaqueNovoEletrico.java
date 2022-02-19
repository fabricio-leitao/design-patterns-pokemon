package com.fabricio.designpatterns.bridge;

public class AtaqueNovoEletrico implements Ataque{
    @Override
    public void atacar() {
        System.out.println("Choque do Trovão!");
    }
}
