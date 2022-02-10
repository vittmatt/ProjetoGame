public class Nintendo implements Console{

    public void dizAdeus() {
        System.out.println("Adeus");
    }


    @Override
    public void joga() {
        System.out.println("Você está jogando um jogo no Nintendo");
    }

    @Override
    public void trocaDeJogo() {
        System.out.println("Você está trocando de jogo no Nintendo");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Nintendo");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Nintendo");
    }

}
