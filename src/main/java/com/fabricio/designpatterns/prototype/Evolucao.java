package com.fabricio.designpatterns.prototype;

public class Evolucao implements Prototype{
    private String nome;

    public Evolucao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Evolucao{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public Prototype clonar() {
        return new Evolucao(nome);
    }
}
