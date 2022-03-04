package br.com.projetoGame.classes;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.*;
import br.com.projetoGame.interfaces.Console;

public class PlayStation extends ConsoleComDisco implements Console {

    @Override
    public void insereDisco() throws DiscoInvalidException {
        super.insereDisco();
    }

    @Override
    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga() throws ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ConsoleInvalidException("O console precisa estar ligado.");
        }
        if (this.getTemDisco() && this.getTotalDiscosInserido() < 2) {
            System.out.println("Você está jogando um jogo no Xbox");
            return;
        }
        throw new ConsoleInvalidException("Parece que o leitor queimou ou não existe um disco!");
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException, ConsoleInvalidException {
        if (jogo == null) {
            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
        }
        if (this.getState().equals(OnOff.ON)) {
            throw new ConsoleInvalidException("Você precisa desligar o console para trocar de jogo!");
        }
        if (this.getTemDisco()) {
            System.out.println("Você está trocando de jogo no PlayStation");
            return;
        }
        throw new ConsoleInvalidException("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        System.out.println("Desligando o PlayStation");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o PlayStation");
    }

}
