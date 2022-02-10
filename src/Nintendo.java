public class Nintendo extends ConsoleComJogoBaixavel implements Console{

    @Override
    public void baixarJogo() {
        super.baixarJogo();
    }

    @Override
    public void desinstalarJogo() {
        super.desinstalarJogo();
    }

    public void dizOi() {
        System.out.println("oi");
    }


    @Override
    public void joga() {
        if (!super.ligado) {
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
    public void trocaDeJogo() {
        if(!super.ligado) {
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
    public void desligar() {
        if(!super.ligado) {
            System.out.println("Ligando o Nintendo");
            super.ligado = true;
            return;
        }
        System.out.println("Desligando o Nintendo");
        super.ligado = false;
    }

    @Override
    public void ligar() {
        if(super.ligado) {
            System.out.println("Desligando o Nintendo");
            super.ligado = false;
            return;
        }
        System.out.println("Ligando o Nintendo");
        super.ligado = true;

    }

}
