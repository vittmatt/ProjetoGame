public class TestaGame {

    public static void main(String[] args) {
        try {
            Console console = new Nintendo();
            Nintendo console2 = (Nintendo) console;
            Jogador j1 = new Jogador("Vitor", console2);
            console2.ligar();
            console2.baixarJogo("Dark Souls");
            console2.baixarJogo("Resident Evil");
            console2.baixarJogo("Alice's Wonderland");
            console2.abrirJogo("Dark Souls");
            console2.abrirJogo("Alice's Wonderland");
            j1.jogar(true);
            console2.desinstalarJogo("Alice's Wonderland");
            j1.jogar(true);

        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }

    }

}
