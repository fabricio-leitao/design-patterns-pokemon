package com.fabricio.designpatterns.builder;

public enum AtaquePrincipal {
    INVESTIDA, ATAQUE_RAPIDO, EVAZIVA;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
