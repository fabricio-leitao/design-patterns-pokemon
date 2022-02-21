package com.fabricio.designpatterns.chainOfResponsibility;

public class Raichu extends Handler{
    @Override
    public int level() {
        return 25;
    }

    @Override
    public void handle(int level) {
        System.out.println("Pikachu evoluiu para o Raichu no level " + level);
    }
}
