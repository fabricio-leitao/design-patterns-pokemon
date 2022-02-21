package com.fabricio.designpatterns.chainOfResponsibility;

public class Pichu extends Handler{
    @Override
    public int level() {
        return 5;
    }

    @Override
    public void handle(int level) {
        System.out.println("Pichu escolhido level " + level);
    }
}
