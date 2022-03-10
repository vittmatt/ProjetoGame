package br.com.projetoGame.testes;

import br.com.projetoGame.models.Jogador;
import br.com.projetoGame.models.Jogo;
import br.com.projetoGame.models.Nintendo;
import br.com.projetoGame.interfaces.ConsoleComJogoBaixavel;

import java.time.LocalDate;
import java.time.Month;

public class TestaGame {

    public static void main(String[] args) {
        try {
            ConsoleComJogoBaixavel console = new Nintendo();
            Nintendo console2 = (Nintendo) console;
            Jogador j1 = new Jogador("Vitor", console2);
            console2.ligar();
            Jogo jogo1 = new Jogo("Dark souls", "Ação","Um jogo extremamente dificil", LocalDate.of(2015, 2, 20));
            console2.baixarJogo(jogo1);
            console2.baixarJogo(new Jogo("Resident Evil", "Terror", "Um jogo de terror de zumbis", LocalDate.of(1996, 3, 22)));
            console2.baixarJogo(new Jogo("Alice: Madness Returns", "Terror", "Alice no pais das maravilhas dark", LocalDate.of(2011, 6, 14)));
            console2.abrirJogo("Dark souls");
            console2.abrirJogo("Alice: Madness Returns");
            j1.jogar();
            console2.desinstalarJogo("Alice: Madness Returns");
            System.out.println(console2.getJogos());
            System.out.println(console2.buscarJogoPeloNome("Resident Evil"));
            System.out.println(console2.buscarJogoPeloGenero("Terror"));
            System.out.println(console2.buscarJogoPeloAnoDeLancamento(2015));


        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }

    }

}
