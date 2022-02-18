package com.fabricio.designpatterns.abstractFactory;

public class BlastoiseFactory extends PokemonFactory{
    @Override
    public Tipo declararTipo() {
        return new TipoAgua();
    }

    @Override
    public Ataque declararAtaque() {
        return new AtaqueAgua();
    }
}
