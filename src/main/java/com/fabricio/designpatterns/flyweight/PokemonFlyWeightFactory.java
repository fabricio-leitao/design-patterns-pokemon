package com.fabricio.designpatterns.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PokemonFlyWeightFactory {

    private static Map<String, PokemonFlyWeight> map = new ConcurrentHashMap<>();

    public static PokemonFlyWeight getPokemon(String key){
        if (map.containsKey(key)){
            System.out.println("Usando cache:");
            return map.get(key);
        } else {
            System.out.println("Criando novo:");
            PokemonFlyWeight pokemonFlyWeight = new PokemonFlyWeightImpl(key);
            map.put(key, pokemonFlyWeight);
            return pokemonFlyWeight;
        }
    }
}
