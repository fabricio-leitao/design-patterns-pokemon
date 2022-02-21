package com.fabricio.designpatterns.chainOfResponsibility;

public class Pokemon extends Handler{
    @Override
    public int level() {
        return 0;
    }

    @Override
    public void handle(int level) {
        System.out.println("Pokemon selecionado level: " + level);
    }
}
