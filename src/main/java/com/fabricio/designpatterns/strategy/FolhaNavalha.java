package com.fabricio.designpatterns.strategy;

public class FolhaNavalha implements AtaqueStrategy{
    @Override
    public void Atacar() {
        System.out.println("Folhas Navalha!!");
    }
}
