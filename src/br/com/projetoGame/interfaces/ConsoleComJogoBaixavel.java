package br.com.projetoGame.interfaces;

import br.com.projetoGame.models.Jogo;
import br.com.projetoGame.exceptions.*;

import java.util.Optional;

public interface ConsoleComJogoBaixavel {
    void baixarJogo(Jogo jogo) throws Exception;
    Optional<Jogo> desinstalarJogo(String jogo) throws JogoInvalidException;
    void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException;
    Optional<Jogo> buscarJogo(String jogo) throws JogoInvalidException;
    void joga() throws JogoInvalidException, ConsoleInvalidException;
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException, JogoInvalidException, ConsoleInvalidException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;
}

