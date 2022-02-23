public class Nintendo extends ConsoleComJogoBaixavel implements Console{

    private String jogoAtual;

    @Override
    public void baixarJogo(String jogo) {
        super.baixarJogo(jogo);
    }

    @Override
    public void desinstalarJogo(String jogo) {
        if(jogoAtual == jogo) {
            System.out.println("Fechando " + jogoAtual);
            jogoAtual = null;
        }
        super.desinstalarJogo(jogo);
    }

    @Override
    public void joga(boolean confirmacao) {
        if(!confirmacao) {
            System.out.println("cancelando jogar");
            return;
        }
        if (this.getState().equals(OnOff.OFF)) {
            System.out.println("Você precisa ligar o Nintendo para jogar!");
            return;
        }
        if (this.getQuantidadeJogosBaixado() == 0) {
            System.out.println("Você precisa baixar algum jogo para jogar");
            return;
        }

        if(jogoAtual == null) {
            System.out.println("Você precisa abrir algum jogo primeiro para poder jogar!");
            return;
        }

        System.out.println("Jogando " + jogoAtual);
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException {
        if(this.getState().equals(OnOff.OFF)) {
            System.out.println("Nintendo está desligado");
            return;
        }

        if(jogo == null) {
            throw new TrocaJogoInvalidaException("Você precisa especificar o jogo a ser aberto");
        }

        if(!this.getJogos().contains(jogo)) {
            System.out.println("Você não tem esse jogo baixado");
        }

        if(jogoAtual != null) {
            System.out.println("Você está trocando de " + jogoAtual + " Para " + jogo);
            jogoAtual = jogo;
            return;
        }

        if (jogoAtual == null) {
            System.out.println("Você está abrindo " + jogo);
            jogoAtual = jogo;
            return;
        }

    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if(this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        System.out.println("Nintendo desligado");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if(this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Nintendo ligado");
    }

}
