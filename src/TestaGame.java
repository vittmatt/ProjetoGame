public class TestaGame {

    public static void main(String[] args) {
        PlayStation console = new PlayStation();
        //console = new PlayStation();
        Jogador j1 = new Jogador("vitor", console);
        
        j1.jogar();
    }

}
