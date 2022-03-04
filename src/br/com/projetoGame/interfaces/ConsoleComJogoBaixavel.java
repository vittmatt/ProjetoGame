package br.com.projetoGame.interfaces;

import br.com.projetoGame.classes.Jogo;
import br.com.projetoGame.exceptions.*;

// TODO: adicionar Exceptions ao invés de return
// TODO: lançar excpetions

public interface ConsoleComJogoBaixavel {
    void baixarJogo(Jogo jogo) throws JogoInvalidException, ConsoleInvalidException;
    Jogo desinstalarJogo(String jogo) throws JogoInvalidException;
    void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException;
    Jogo buscarJogo(String jogo) throws JogoInvalidException;
    void joga() throws JogoInvalidException, ConsoleInvalidException;
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException, JogoInvalidException, ConsoleInvalidException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;
}

