public interface Console {
    // Adicionado Exceptions para Console e Jogador//
    // Adicionado Enums //
    // Adicionado exeptions para todos esses métodos//

    void joga(boolean confirmacao) throws ConfirmacaoInvalidaException;
    void trocaDeJogo(String jogo) throws TrocaJogoInvalidaException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;

}
