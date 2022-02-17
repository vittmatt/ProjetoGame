public class Nintendo extends ConsoleComJogoBaixavel implements Console{

    @Override
    public void baixarJogo() {
        super.baixarJogo();
    }

    @Override
    public void desinstalarJogo() {
        super.desinstalarJogo();
    }

    @Override
    public void joga(boolean confirmacao) throws ConfirmacaoInvalida {
        if (super.state == super.off) {
            if(confirmacao != true && confirmacao != false) {
                throw new ConfirmacaoInvalida("Método joga só aceita boolean");
            }
            if(confirmacao == false) {
                System.out.println("cancelando jogar");
            }
            System.out.println("Você precisa ligar o Nintendo para jogar!");
            return;
        }
        if (super.isJogoBaixado()) {
            System.out.println("Você está jogando um jogo no Nintendo");
            return;
        }
        System.out.println("Você precisa baixar ao menos um jogo para poder jogar!");
    }

    @Override
    public void trocaDeJogo(String jogo) throws TrocaJogoInvalida {
        if(jogo == null) {
            throw new TrocaJogoInvalida("Troca de jogo Inválida");
        }
        if(super.state == super.off) {
            System.out.println("O nintendo precisa estar ligado para trocar de jogo");
            return;
        }
        if(super.isJogoBaixado() && super.getQuantidadeJogosBaixado() >= 2) {
            System.out.println("Você está trocando de jogo no Nintendo");
            return;
        }
        System.out.println("Você precisa baixar ao menos 2 jogos para poder trocar de jogo!");

    }

    @Override
    public void desligar() throws ImpossivelDesligar {
        if(super.state == super.off) {
            throw new ImpossivelDesligar("Console já desligado");
        }
        System.out.println("Desligando o Nintendo");
        super.state = super.off;
    }

    @Override
    public void ligar() throws ImpossivelLigar {
        if(super.state == super.on) {
            throw new ImpossivelLigar("Console já ligado");
        }
        super.state = super.on;
        System.out.println("Ligando o Nintendo");


    }

}
