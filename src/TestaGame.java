public class TestaGame {

    public static void main(String[] args) {
        /*
        Não consegui fazer funcionar desse jeito
                !⇩⇩⇩⇩⇩⇩⇩⇩⇩!
        console = new PlayStation();
         */

        Nintendo console = new Nintendo();
        Jogador j1 = new Jogador("vitor", console);
        console.ligar();
        console.baixarJogo();
        console.baixarJogo();
        console.trocaDeJogo();
        console.desligar();
        console.desligar();
        j1.jogar();
    }

}
