public class Jogador {
    public String nome;
    public Console console;

    public Jogador(String nome, Console console) throws JogadorSemConsole {
        this.nome = nome;
        this.console = console;
        if(console == null) {
            throw new JogadorSemConsole("Console não pode ser null");
        }
    }

    public void jogar(boolean confirmacao) throws ConfirmacaoInvalida {
        console.joga(confirmacao);
    }

}
