public class PlayStation extends ConsoleComDisco implements Console{

    public void insereDisco() {
        super.insereDisco();
    }

    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga() {
        if(!ligado) {
            System.out.println("O console precisa estar ligado.");
            return;
        }
        if(ligado) {
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
    public void trocaDeJogo() {
        if(ligado) {
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
    public void desligar() {
        if(ligado) {
            System.out.println("Desligando o console");
            return;
        }
        System.out.println("Ligando o PlayStation");
    }

    @Override
    public void ligar() {
        if(ligado) {
            System.out.println("Desligando o console");
            return;
        }
        System.out.println("Ligando o PlayStation");
    }

}
