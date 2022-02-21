package com.fabricio.designpatterns.chainOfResponsibility;

public class Pikachu extends Handler{
    @Override
    public int level() {
        return 15;
    }

    @Override
    public void handle(int level) {
        System.out.println("Pichu evoluiu para Pikachu no level " + level);
    }
}
