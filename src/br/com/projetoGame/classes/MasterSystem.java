package br.com.projetoGame.classes;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.*;
import br.com.projetoGame.interfaces.Console;

public class MasterSystem extends ConsoleComFita implements Console {

    @Override
    public void insereFita() throws FitaInvalidException {
        super.insereFita();
    }

    @Override
    public void retiraFita() {
        super.retiraFita();
    }

    @Override
    public void joga() throws ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ConsoleInvalidException("Você precisa ligar o console para jogar!");
        }
        if (this.getTemFita() && this.getTotalFitasInserida() < 750) {
            System.out.println("Você está jogando um jogo no MasterSystem");
            return;
        }
        throw new ConsoleInvalidException("Parece que o leitor queimou ou não existe uma fita inserida!");
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException, ConsoleInvalidException {
        if (jogo == null) {
            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
        }
        if (this.getState().equals(OnOff.ON)) {
            throw new ConsoleInvalidException("Você precisa desligar o console para trocar de jogo!");
        }
        if (this.getTemFita()) {
            System.out.println("Você está trocando fita no MasterSystem");
            return;
        }
        throw new ConsoleInvalidException("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        this.setState(OnOff.OFF);
        System.out.println("Desligando o MasterSystem");

    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o MasterSystem");
    }

}
