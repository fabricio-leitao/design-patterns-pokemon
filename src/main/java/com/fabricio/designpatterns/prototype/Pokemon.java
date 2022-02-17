package com.fabricio.designpatterns.prototype;

public class Pokemon implements Prototype{

    private String nome;
    private String tipo;
    private String level;
    private Evolucao evolucao;

    public Pokemon(String nome, String tipo, String level, Evolucao evolucao) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        this.evolucao = evolucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Evolucao getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(Evolucao evolucao) {
        this.evolucao = evolucao;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", level='" + level + '\'' +
                ", evolucao=" + evolucao +
                '}';
    }

    @Override
    public Prototype clonar() {
        return new Pokemon(nome, tipo, level, (Evolucao) evolucao);
    }
}
