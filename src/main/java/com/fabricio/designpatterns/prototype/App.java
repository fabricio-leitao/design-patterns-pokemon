package com.fabricio.designpatterns.prototype;

public class App {

    public static void main(String[] args) {
        Evolucao graveler = new Evolucao("graveler");
        Pokemon geodude = new Pokemon("geodude", "pedra", "15", graveler);


        Pokemon magikarp = (Pokemon) geodude.clonar();
        magikarp.setNome("Magikarp");
        Pokemon chimchar = (Pokemon) geodude.clonar();
        chimchar.setNome("Chimchar");
        Pokemon pikachu = (Pokemon) geodude.clonar();
        pikachu.setNome("Pikachu");
        System.out.println(geodude);
        System.out.println(magikarp);
        System.out.println(chimchar);
        System.out.println(pikachu);
    }
}
