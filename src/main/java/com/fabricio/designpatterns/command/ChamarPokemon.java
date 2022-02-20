package com.fabricio.designpatterns.command;

import lombok.Setter;

@Setter
public class ChamarPokemon {
    Command command;

    public void arremessaPokebola(){
        this.command.execute();
    }
}
