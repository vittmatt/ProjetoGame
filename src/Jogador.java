public class Jogador {
    public String nome;
    public Console console;

    public Jogador(String nome, Console console) throws JogadorSemConsoleException {
        if(console == null || nome == null) {
            throw new JogadorSemConsoleException("Jogador inválido");
        }
        this.nome = nome;
        this.console = console;
    }

    public void jogar(boolean confirmacao) {
        console.joga(confirmacao);
    }

}
