package br.com.projetoGame.classes;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.ImpossivelDesligarException;
import br.com.projetoGame.exceptions.ImpossivelLigarException;
import br.com.projetoGame.exceptions.TrocaJogoInvalidaException;
import br.com.projetoGame.interfaces.Console;

public class MasterSystem extends ConsoleComFita implements Console {

    @Override
    public void insereFita() {
        super.insereFita();
    }

    @Override
    public void retiraFita() {
        super.retiraFita();
    }

    @Override
    public void joga() {
        if (this.getState().equals(OnOff.OFF)) {
            System.out.println("Você precisa ligar o console para jogar!");
            return;
        }
        if (this.getTemFita() && this.getTotalFitasInserida() < 750) {
            System.out.println("Você está jogando um jogo no br.com.projetoGame.classes.MasterSystem");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe uma fita inserida!");
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
        if (this.getTemFita()) {
            System.out.println("Você está trocando fita no br.com.projetoGame.classes.MasterSystem");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("br.com.projetoGame.interfaces.Console já desligado");
        }
        this.setState(OnOff.OFF);
        System.out.println("Desligando o br.com.projetoGame.classes.MasterSystem");

    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("br.com.projetoGame.interfaces.Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o br.com.projetoGame.classes.MasterSystem");
    }

}
