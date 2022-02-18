public class TestaGame {

    public static void main(String[] args) {
        try {
            Console console = new PlayStation();
            PlayStation console2 = (PlayStation) console;
            Jogador j1 = null;//new Jogador("vitor", console2);
            if (j1 == null) {
                throw new JogadorNull("Jogador não pode ser null");
            }
            j1.jogar(true);

            Console console3 = new Nintendo();
            Nintendo console4 = (Nintendo) console3;
            Jogador j2 = new Jogador("vitor", console4);
            if (j2 == null) {
                throw new JogadorNull("Jogador não pode ser null");
            }
            console4.ligar();
            console4.baixarJogo();
            console4.baixarJogo();
            console4.trocaDeJogo("Dark souls");
            console4.desligar();
            console4.desligar();
        } catch (JogadorNull | JogadorSemConsole | ConfirmacaoInvalida |
                TrocaJogoInvalida | ImpossivelDesligar | ImpossivelLigar e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }

    }

}
