package com.fabricio.designpatterns.builder;

public class Pokemon {

    private final Tipo tipo;
    private final AtaquePrincipal ataquePrincipal;
    private final String nome;
    private final String level;
    private final String sexo;

    Pokemon(PokemonBuilder builder){
        this.tipo = builder.tipo;
        this.ataquePrincipal = builder.ataquePrincipal;
        this.nome = builder.nome;
        this.level = builder.level;
        this.sexo= builder.sexo;

    }

    public Tipo getTipo() {
        return tipo;
    }

    public AtaquePrincipal getAtaquePrincipal() {
        return ataquePrincipal;
    }

    public String getNome() {
        return nome;
    }

    public String getLevel() {
        return level;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("O pokemon ")
                .append(nome)
                .append(" é do tipo ")
                .append(tipo)
                .append(" e tem o ataque ")
                .append(ataquePrincipal)
                .append(" do sexo ")
                .append(sexo)
                .append(" e tem o level ")
                .append(level);

        return sb.toString();
    }

    public static class PokemonBuilder {
        private final Tipo tipo;
        private final AtaquePrincipal ataquePrincipal;
        private String nome;
        private String level;
        private String sexo;

        public PokemonBuilder(Tipo tipo, AtaquePrincipal ataquePrincipal){
            if (tipo == null || ataquePrincipal == null){
                throw new IllegalArgumentException("Valor invalido");
            } else {
                this.tipo = tipo;
                this.ataquePrincipal = ataquePrincipal;
            }
        }

        public PokemonBuilder withNome(String nome){
            this.nome = nome;
            return this;
        }

        public PokemonBuilder withLevel(String level){
            this.level = level;
            return this;
        }

        public PokemonBuilder withSexo(String sexo){
            this.sexo = sexo;
            return this;
        }

        public Pokemon build(){
            return new Pokemon(this);
        }
    }
}
