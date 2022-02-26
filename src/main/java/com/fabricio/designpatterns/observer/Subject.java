package com.fabricio.designpatterns.observer;

public interface Subject {

    void registraObserver(Observer observer);
    void removeObserver(Observer observer);
    void notificaObservers();
}
