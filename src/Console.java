public interface Console {
    void joga(boolean confirmacao);
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;
}
