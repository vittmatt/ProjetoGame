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
    public void joga(boolean confirmacao){
        if(!confirmacao) {
            System.out.println("cancelando jogar");
        }
        if(super.state == super.off) {
            System.out.println("O console precisa estar ligado.");
            return;
        }
        if(this.getTemDisco() && this.getTotalDiscosInserido() < 2 && confirmacao) {
            System.out.println("Você está jogando um jogo no Xbox");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe um disco!");
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException {
        if(jogo == null) {
            throw new TrocaJogoInvalida("Troca de jogo Inválida");
        }
        if(super.state == super.on) {
            System.out.println("Você precisa desligar o console para trocar de jogo!");
            return;
        }
        if(this.getTemDisco()) {
            System.out.println("Você está trocando de jogo no Xbox");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() throws ImpossivelDesligar {
        if(super.state == super.off) {
            throw new ImpossivelDesligar("Console já desligado");
        }
        System.out.println("Desligando o Xbox");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigar {
        if(super.state == super.on) {
            throw new ImpossivelLigar("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Ligando o Xbox");
    }

}
