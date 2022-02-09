public class PlayStation extends ConsoleComDisco implements Console{

    public void getTotalDisco() {
        System.out.println(super.getTotalDiscoInserido());
    }

    public void insereDisco() {
        super.insereDisco();
    }

    public void ejetaDisco() {
        super.ejetaDisco();
    }

    @Override
    public void joga() {
        if(super.getTemDisco() && super.getTotalDiscoInserido() < 250) {
            System.out.println("Você está jogando um jogo no PlayStation");

            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe um disco!");
    }

    @Override
    public void trocaDeJogo() {
        if(!super.getTemDisco()) {
            System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
            return;
        }
        System.out.println("Você está trocando de jogo no PlayStation");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o PlayStation");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o PlayStation");
    }

}
