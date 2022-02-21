public class Xbox extends ConsoleComDisco implements Console{

    @Override
    public void insereDisco() {
        super.insereDisco();
    }

    @Override
    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga(boolean confirmacao) throws ConfirmacaoInvalidaException {
        if(confirmacao != true && confirmacao != false) {
            throw new ConfirmacaoInvalidaException("Método joga só aceita boolean");
        }
        if(confirmacao == false) {
            System.out.println("cancelando jogar");
        }
        if(this.getState().equals(OnOff.OFF)) {
            System.out.println("O console precisa estar ligado.");
            return;
        }
        if(super.getTemDisco() && super.getTotalDiscosInserido() < 2 && confirmacao) {
            System.out.println("Você está jogando um jogo no Xbox");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe um disco!");
    }

    @Override
    public void trocaDeJogo(String jogo) throws TrocaJogoInvalidaException {
        if(jogo == null) {
            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
        }
        if(this.getState().equals(OnOff.ON)) {
            System.out.println("Você precisa desligar o console para trocar de jogo!");
            return;
        }
        if(super.getTemDisco()) {
            System.out.println("Você está trocando de jogo no Xbox");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if(this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        System.out.println("Desligando o Xbox");
        setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if(this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        setState(OnOff.ON);
        System.out.println("Ligando o Xbox");
    }

}
