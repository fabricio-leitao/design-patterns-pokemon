package com.fabricio.designpatterns.visitor;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Item {

    private List<PokemonVisitable> items = new ArrayList<>();
}
