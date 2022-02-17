public interface Console {
    // Adicionado Exceptions para Console e Jogador//
    // Adicionado Enums //
    // Adicionar exeptions para todos esses métodos//

    void joga(boolean confirmacao) throws ConfirmacaoInvalida;
    void trocaDeJogo(String jogo) throws TrocaJogoInvalida;
    void desligar() throws ImpossivelDesligar;
    void ligar() throws ImpossivelLigar;

}
