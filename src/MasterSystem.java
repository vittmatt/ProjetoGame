public class MasterSystem implements Console{

    @Override
    public void joga() {
        System.out.println("Você está jogando um jogo no MasterSystem");
    }

    @Override
    public void trocaDeJogo() {
        System.out.println("Você está trocando de jogo no MasterSystem");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o MasterSystem");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o MasterSystem");
    }

}
