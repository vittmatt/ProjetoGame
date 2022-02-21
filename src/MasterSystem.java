public class MasterSystem extends ConsoleComFita implements Console{

    @Override
    public void insereFita() {
        super.insereFita();
    }

    @Override
    public void retiraFita() {
        super.retiraFita();
    }

    @Override
    public void joga(boolean confirmacao) throws ConfirmacaoInvalida {
        if(confirmacao != true && confirmacao != false) {
            throw new ConfirmacaoInvalida("Método joga só aceita boolean");
        }
        if(confirmacao == false) {
            System.out.println("cancelando jogar");
        }
        if(super.state == super.off) {
            System.out.println("Você precisa ligar o console para jogar!");
            return;
        }
        if(super.getTemFita() && super.getTotalFitasInserida() < 750) {
            System.out.println("Você está jogando um jogo no MasterSystem");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe uma fita inserida!");
    }

    @Override
    public void trocaDeJogo(String jogo) throws TrocaJogoInvalida {
        if(jogo == null) {
            throw new TrocaJogoInvalida("Troca de jogo Inválida");
        }
        if(super.state == super.on) {
            System.out.println("Você precisa desligar o console para trocar de jogo!");
            return;
        }
        if(super.getTemFita()) {
            System.out.println("Você está trocando fita no MasterSystem");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligar {
        if(super.state == super.off) {
            throw new ImpossivelDesligar("Console já desligado");
        }
        super.state = super.off;
        System.out.println("Desligando o MasterSystem");
    }

    @Override
    public void ligar() throws ImpossivelLigar {
        if(super.state == super.on) {
            throw new ImpossivelLigar("Console já ligado");
        }
        super.state = super.on;
        System.out.println("Ligando o MasterSystem");
    }

}
