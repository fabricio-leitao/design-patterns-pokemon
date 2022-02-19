package com.fabricio.designpatterns.bridge;

public class App {

    public static void main(String[] args) {
        Pokemon pikachuAtaqueAntigo = new Pikachu(new AtaqueAntigoEletrico());
        Pokemon pikachuAtaqueNovo = new Pikachu(new AtaqueNovoEletrico());
        pikachuAtaqueAntigo.nome();
        pikachuAtaqueAntigo.ataque.atacar();
        pikachuAtaqueNovo.nome();
        pikachuAtaqueNovo.ataque.atacar();
        System.out.println();
        Pokemon squirtleAtaqueAntigo = new Squirtle(new AtaqueAntigoAgua());
        Pokemon squirtleAtaqueNovo = new Squirtle(new AtaqueNovoAgua());
        squirtleAtaqueAntigo.nome();
        squirtleAtaqueAntigo.ataque.atacar();
        squirtleAtaqueNovo.nome();
        squirtleAtaqueNovo.ataque.atacar();
        System.out.println();
    }
}
