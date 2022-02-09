public class TestaGame {

    public static void main(String[] args) {
        PlayStation console = new PlayStation();
        //console = new PlayStation();
        Jogador j1 = new Jogador("vitor", console);
        j1.console.desligar();
        console.insereDisco();
        console.ejetaDisco();
        console.insereDisco();
        console.getTotalDisco();
        j1.jogar();
        console.insereDisco();
    }

}
