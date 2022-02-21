public class PlayStation extends ConsoleComDisco implements Console{

    @Override
    public void insereDisco() {
        super.insereDisco();
    }

    @Override
    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga(boolean confirmacao) throws ConfirmacaoInvalida {
        if(super.state == super.off) {
            if(confirmacao != true && confirmacao != false) {
                throw new ConfirmacaoInvalida("Método joga só aceita boolean");
            }
            if(confirmacao == false) {
                System.out.println("cancelando jogar");
            }
            System.out.println("Você precisa ligar o console para jogar!");
            return;
        }
        if(super.getTemDisco() && super.getTotalDiscosInserido() < 350) {
            System.out.println("Você está jogando um jogo no PlayStation");

            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe um disco!");
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
        if(super.getTemDisco()) {
            System.out.println("Você está trocando de jogo no PlayStation");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligar {
        if(super.state == super.off) {
            throw new ImpossivelDesligar("Console já desligado");
        }
        System.out.println("Desligando o PlayStation");
        super.state = super.off;
    }

    @Override
    public void ligar() throws ImpossivelLigar {
        if(super.state == super.on) {
            throw new ImpossivelLigar("Console já ligado");
        }
        super.state = super.on;
        System.out.println("Ligando o PlayStation");
    }

}
