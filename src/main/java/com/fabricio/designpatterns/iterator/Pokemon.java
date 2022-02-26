package com.fabricio.designpatterns.iterator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {

    private String name;
    private String tipo;
    private Integer level;

    public Pokemon(String name, String tipo, Integer level) {
        this.name = name;
        this.tipo = tipo;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", level=" + level +
                '}';
    }
}
