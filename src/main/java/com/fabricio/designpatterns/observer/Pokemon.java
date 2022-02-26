package com.fabricio.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Subject{

    private List<Observer> observers;
    private String pokemon;

    public Pokemon() {
        observers = new ArrayList<>();
    }

    @Override
    public void registraObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificaObservers() {
        for (Observer observer : observers) {
            observer.update(pokemon);
        }
    }

    public void setPokemon(String pokemon){
        this.pokemon = pokemon;
        notificaObservers();
    }
}
