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
    public void joga(boolean confirmacao) throws ConfirmacaoInvalidaException {
        if (this.getState().equals(OnOff.OFF)) {
            if(confirmacao != true && confirmacao != false) {
                throw new ConfirmacaoInvalidaException("Método joga só aceita boolean");
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
    public void trocaDeJogo(String jogo) throws TrocaJogoInvalidaException {
        if(jogo == null) {
            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
        }
        if(this.getState().equals(OnOff.OFF)) {
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
    public void desligar() throws ImpossivelDesligarException {
        if(this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        System.out.println("Desligando o Nintendo");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if(this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o Nintendo");

    }

}
