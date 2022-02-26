package com.fabricio.designpatterns.iterator;

public class App {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();

        iterator(pokedex.iterator());
    }

    private static void iterator( Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
