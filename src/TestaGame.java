public class TestaGame {

    public static void main(String[] args) {
        Console console = new PlayStation();
        Jogador j1 = new Jogador("vitor", console);
        PlayStation console2 = (PlayStation) console;
        j1.jogar();

        Console console3 = new Nintendo();
        Nintendo console4 = (Nintendo) console;
        Jogador j2 = new Jogador("vitor", console);
        console4.ligar();
        console4.baixarJogo();
        console4.baixarJogo();
        console4.trocaDeJogo();
        console4.desligar();
        console4.desligar();
    }

}
