public class Jogador {
    public String nome;
    public Console console;

    public Jogador(String nome, Console console) {
        this.nome = nome;
        this.console = console;
    }

    public void jogar() {
        console.joga();
        //if(console == null)
    }

}
