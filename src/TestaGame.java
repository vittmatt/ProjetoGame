public class TestaGame {

    public static void main(String[] args) {
        /*
        Não consegui fazer funcionar desse jeito
                !⇩⇩⇩⇩⇩⇩⇩⇩⇩!
        Console console = new PlayStation();
         */

        Console console = new Nintendo();
        Nintendo console2 = (Nintendo) console;
        Jogador j1 = new Jogador("vitor", console);
        console.ligar();
        console2.baixarJogo();
        console2.baixarJogo();
        console2.trocaDeJogo();
        console2.desligar();
        console2.desligar();
    }

}
