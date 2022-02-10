public class TestaGame {

    public static void main(String[] args) {
        Console console = new PlayStation();
        //console = new PlayStation();
        Jogador j1 = new Jogador("vitor", console);
        PlayStation console2 = (PlayStation) console;
        
        j1.jogar();
    }

}
