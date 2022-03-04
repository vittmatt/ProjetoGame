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
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome: " + this.nome +
                ", descricao: " + this.descricao +
                ", genero: " + this.genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return Objects.equals(this.nome, jogo.nome) && Objects.equals(this.descricao, jogo.descricao) && Objects.equals(this.genero, jogo.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.descricao, this.genero);
    }
}
