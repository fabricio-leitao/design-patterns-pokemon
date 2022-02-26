package com.fabricio.designpatterns.iterator;

public interface Iterator<T> {

    boolean hasNext();

    T next();
}
