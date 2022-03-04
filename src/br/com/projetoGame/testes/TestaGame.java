package br.com.projetoGame.testes;

import br.com.projetoGame.classes.Jogador;
import br.com.projetoGame.classes.Jogo;
import br.com.projetoGame.classes.Nintendo;
import br.com.projetoGame.interfaces.Console;
import br.com.projetoGame.interfaces.ConsoleComJogoBaixavel;

public class TestaGame {

    public static void main(String[] args) {
        try {
            ConsoleComJogoBaixavel console = new Nintendo();
            Nintendo console2 = (Nintendo) console;
            Jogador j1 = new Jogador("Vitor", console2);
            console2.ligar();
            Jogo jogo1 = new Jogo("Dark souls", "Ação","Um jogo extremamente dificil");
            console2.baixarJogo(jogo1);
            console2.baixarJogo(new Jogo("Resident Evil", "Terror", "Um jogo de terror de zumbis"));
            console2.baixarJogo(new Jogo("Alice's Wonderland", "Terror", "Alice no pais das maravilhas dark"));
            console2.abrirJogo("Dark souls");
            console2.abrirJogo("Alice's Wonderland");
            j1.jogar();
            console2.desinstalarJogo("Alice's Wonderland");
            j1.jogar();
            System.out.println(console2.getJogos());
            System.out.println(console2.buscarJogo("Dark souls"));

        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }

    }

}
