public class PlayStation implements Console{

    @Override
    public void joga() {
        System.out.println("Você está jogando um jogo no PlayStation");
    }

    @Override
    public void trocaDeJogo() {
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
