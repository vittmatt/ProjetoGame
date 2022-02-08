public class TestaGame {

    public static void main(String[] args) {
        Nintendo nintendo = new Nintendo();
        Jogador j1 = new Jogador("vitor", nintendo);
        j1.console.desligar();
        j1.jogar();
    }

}
