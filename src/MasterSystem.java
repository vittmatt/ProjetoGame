//public class MasterSystem extends ConsoleComFita implements Console{
//
//    @Override
//    public void insereFita() {
//        super.insereFita();
//    }
//
//    @Override
//    public void retiraFita() {
//        super.retiraFita();
//    }
//
//    @Override
//    public void joga(boolean confirmacao){
//        if(!confirmacao) {
//            System.out.println("cancelando jogar");
//            return;
//        }
//        if(this.getState().equals(OnOff.OFF)) {
//            System.out.println("Você precisa ligar o console para jogar!");
//            return;
//        }
//        if(this.getTemFita() && this.getTotalFitasInserida() < 750) {
//            System.out.println("Você está jogando um jogo no MasterSystem");
//            return;
//        }
//        System.out.println("Parece que o leitor queimou ou não existe uma fita inserida!");
//    }
//
//    @Override
//    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException {
//        if(jogo == null) {
//            throw new TrocaJogoInvalidaException("Troca de jogo Inválida");
//        }
//        if(this.getState().equals(OnOff.ON)) {
//            System.out.println("Você precisa desligar o console para trocar de jogo!");
//            return;
//        }
//        if(this.getTemFita()) {
//            System.out.println("Você está trocando fita no MasterSystem");
//            return;
//        }
//        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
//    }
//
//    @Override
//    public void desligar() throws ImpossivelDesligarException {
//        if(this.getState().equals(OnOff.OFF)) {
//            throw new ImpossivelDesligarException("Console já desligado");
//        }
//        this.setState(OnOff.OFF);
//        System.out.println("Desligando o MasterSystem");
//
//    }
//
//    @Override
//    public void ligar() throws ImpossivelLigarException {
//        if(this.getState().equals(OnOff.ON)) {
//            throw new ImpossivelLigarException("Console já ligado");
//        }
//        this.setState(OnOff.ON);
//        System.out.println("Ligando o MasterSystem");
//    }
//
//}
