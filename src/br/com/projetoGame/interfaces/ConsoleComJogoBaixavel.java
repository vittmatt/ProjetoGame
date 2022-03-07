package br.com.projetoGame.interfaces;

import br.com.projetoGame.models.Jogo;
import br.com.projetoGame.exceptions.*;

public interface ConsoleComJogoBaixavel {
    void baixarJogo(Jogo jogo) throws Exception;
    Jogo desinstalarJogo(String jogo) throws JogoInvalidException;
    void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException;
    Jogo buscarJogo(String jogo) throws JogoInvalidException;
    void joga() throws JogoInvalidException, ConsoleInvalidException;
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException, JogoInvalidException, ConsoleInvalidException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;
}

