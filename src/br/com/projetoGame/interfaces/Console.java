package br.com.projetoGame.interfaces;

import br.com.projetoGame.classes.Jogo;
import br.com.projetoGame.exceptions.ImpossivelDesligarException;
import br.com.projetoGame.exceptions.ImpossivelLigarException;
import br.com.projetoGame.exceptions.JogoInvalidException;
import br.com.projetoGame.exceptions.TrocaJogoInvalidaException;

public interface Console {
    void joga();

    void abrirJogo(String jogo) throws TrocaJogoInvalidaException;

    void desligar() throws ImpossivelDesligarException;

    void ligar() throws ImpossivelLigarException;
}
