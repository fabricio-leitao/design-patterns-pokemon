package com.fabricio.designpatterns.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pokemon {
    private String nome;
    private int level;
    private Tipo tipo;
}
