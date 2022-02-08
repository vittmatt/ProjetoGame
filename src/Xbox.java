public class Xbox implements Console{

    @Override
    public void joga() {
        System.out.println("Você está jogando um jogo no Xbox");
    }

    @Override
    public void trocaDeJogo() {
        System.out.println("Você está trocando de jogo no Xbox");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Xbox");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Xbox");
    }

}
