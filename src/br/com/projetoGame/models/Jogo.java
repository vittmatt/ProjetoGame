package br.com.projetoGame.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Objects;

public class Jogo {
    private String nome;
    private String descricao;
    private String genero;
    private LocalDate dataDeLancamento;

    public Jogo(String nome, String genero, String descricao, LocalDate dataDeLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
        this.dataDeLancamento = dataDeLancamento;
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

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome: " + this.nome +
                ", descricao: " + this.descricao +
                ", genero: " + this.genero +
                ", Data de Lançamento: " + this.dataDeLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
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
