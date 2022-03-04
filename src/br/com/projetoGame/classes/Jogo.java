package br.com.projetoGame.classes;

import java.util.Objects;

public class Jogo {
    private String nome;
    private String descricao;
    private String genero;

    public Jogo(String nome, String genero, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome: " + nome +
                ", descricao: " + descricao +
                ", genero: " + genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return Objects.equals(nome, jogo.nome) && Objects.equals(descricao, jogo.descricao) && Objects.equals(genero, jogo.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, genero);
    }
}
