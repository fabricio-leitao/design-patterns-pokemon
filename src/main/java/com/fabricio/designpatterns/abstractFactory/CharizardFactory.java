package com.fabricio.designpatterns.abstractFactory;

public class CharizardFactory extends PokemonFactory{
    @Override
    public Tipo declararTipo() {
        return new TipoFogo();
    }

    @Override
    public Ataque declararAtaque() {
        return new AtaqueFogo();
    }
}
