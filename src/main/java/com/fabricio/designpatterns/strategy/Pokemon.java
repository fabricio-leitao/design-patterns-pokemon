package com.fabricio.designpatterns.strategy;

public class Pokemon {
    private AtaqueStrategy ataqueStrategy;

    public void setAtaqueStrategy(AtaqueStrategy ataqueStrategy) {
        this.ataqueStrategy = ataqueStrategy;
    }

    public void usarAtaque(){
        ataqueStrategy.Atacar();
    }
}
