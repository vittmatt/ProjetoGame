package br.com.projetoGame.models;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.DiscoInvalidException;
import br.com.projetoGame.exceptions.ImpossivelDesligarException;
import br.com.projetoGame.exceptions.ImpossivelLigarException;
import br.com.projetoGame.exceptions.TrocaJogoInvalidaException;
import br.com.projetoGame.interfaces.Console;

public class Xbox extends ConsoleComDisco implements Console {

    @Override
    public void insereDisco() throws DiscoInvalidException {
        super.insereDisco();
    }

    @Override
    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga() {
        if (this.getState().equals(OnOff.OFF)) {
            System.out.println("O console precisa estar ligado.");
            return;
        }
        if (this.getTemDisco() && this.getTotalDiscosInserido() < 2) {
            System.out.println("Você está jogando um jogo no Xbox");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe um disco!");
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException {
        if (jogo == null) {
            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
        }
        if (this.getState().equals(OnOff.ON)) {
            System.out.println("Você precisa desligar o console para trocar de jogo!");
            return;
        }
        if (this.getTemDisco()) {
            System.out.println("Você está trocando de jogo no br.com.projetoGame.classes.Xbox");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("br.com.projetoGame.interfaces.Console já desligado");
        }
        System.out.println("Desligando o br.com.projetoGame.classes.Xbox");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("br.com.projetoGame.interfaces.Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o br.com.projetoGame.classes.Xbox");
    }

}
