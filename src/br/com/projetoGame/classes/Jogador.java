package br.com.projetoGame.classes;

import br.com.projetoGame.exceptions.ConsoleInvalidException;
import br.com.projetoGame.exceptions.JogadorSemConsoleException;
import br.com.projetoGame.exceptions.JogoInvalidException;
import br.com.projetoGame.interfaces.Console;
import br.com.projetoGame.interfaces.ConsoleComJogoBaixavel;

public class Jogador {
    public String nome;
    public Console console;
    public ConsoleComJogoBaixavel consoleComJogoBaixavel;

    public Jogador(String nome, Console console) throws JogadorSemConsoleException {
        if (console == null || nome == null) {
            throw new JogadorSemConsoleException("Jogador inválido");
        }
        this.nome = nome;
        this.console = console;
    }

    public Jogador(String nome, ConsoleComJogoBaixavel consoleComJogoBaixavel) throws JogadorSemConsoleException {
        if (consoleComJogoBaixavel == null || nome == null) {
            throw new JogadorSemConsoleException("Jogador inválido");
        }
        this.nome = nome;
        this.consoleComJogoBaixavel = consoleComJogoBaixavel;
    }

    public void jogar() throws JogoInvalidException, ConsoleInvalidException {
        if(this.console != null) {
            this.console.joga();
        }

        if(this.consoleComJogoBaixavel != null) {
            this.consoleComJogoBaixavel.joga();
        }
    }

    @Override
    public String toString() {
        return "Nome do jogador é " + this.nome + ", e o console do jogador é " + this.console;
    }
}
