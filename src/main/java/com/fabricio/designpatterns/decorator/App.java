package com.fabricio.designpatterns.decorator;

public class App {

    public static void imprimirDados(Pokemon p){
        System.out.println("Level: " + p.informaLevel() + " Tipo: " + p.informaTipo());
    }

    public static void main(String[] args) {

        Pokemon pidgey = new Pidgey();
        imprimirDados(pidgey);

        pidgey = new Pidgeotto(pidgey);
        imprimirDados(pidgey);

        pidgey = new Pidgey();
        pidgey = new Pidgeot(pidgey);
        imprimirDados(pidgey);

    }
}
