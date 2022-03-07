package br.com.projetoGame.interfaces;

import br.com.projetoGame.exceptions.*;

public interface Console {
    void joga() throws ConsoleInvalidException;

    void abrirJogo(String jogo) throws TrocaJogoInvalidaException, ConsoleInvalidException;

    void desligar() throws ImpossivelDesligarException;

    void ligar() throws ImpossivelLigarException;
}
