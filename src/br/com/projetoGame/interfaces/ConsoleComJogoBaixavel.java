package br.com.projetoGame.interfaces;

import br.com.projetoGame.models.Jogo;
import br.com.projetoGame.exceptions.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface ConsoleComJogoBaixavel {
    void baixarJogo(Jogo jogo) throws Exception;
    void desinstalarJogo(String jogo) throws JogoInvalidException;
    void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException;
    Jogo buscarJogoPeloNome(String jogo) throws JogoInvalidException;
    Jogo buscarJogoPeloGenero(String genero) throws JogoInvalidException;
    Jogo buscarJogoPeloAnoDeLancamento(int anoDeLancamento) throws JogoInvalidException;
    void joga() throws JogoInvalidException, ConsoleInvalidException;
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException, JogoInvalidException, ConsoleInvalidException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;
}

