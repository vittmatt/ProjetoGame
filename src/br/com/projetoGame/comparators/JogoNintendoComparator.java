package br.com.projetoGame.comparators;

import br.com.projetoGame.classes.Jogo;

import java.util.Comparator;

public class JogoNintendoComparator implements Comparator {

    @Override
    public int compare(Object j1, Object j2) {
        Jogo jogo1 = (Jogo) j1;
        Jogo jogo2 = (Jogo) j2;
        return jogo1.getNome().compareTo(jogo2.getNome());
    }
}
