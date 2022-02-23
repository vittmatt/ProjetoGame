public interface Console {

//    Refatorar:
//        ConsoleComDisco
//        ConsoleComFita
//            MasterSystem
//            Playstation
//            Xbox        

    void joga(boolean confirmacao);
    void abrirJogo(String jogo) throws TrocaJogoInvalidaException;
    void desligar() throws ImpossivelDesligarException;
    void ligar() throws ImpossivelLigarException;

}
