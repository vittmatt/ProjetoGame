public class MasterSystem extends ConsoleComFita implements Console{

    @Override
    public void insereFita() {
        super.insereFita();
    }

    @Override
    public void retiraFita() {
        super.retiraFita();
    }

    @Override
    public void joga() {
        if(!super.ligado) {
            System.out.println("Você precisa ligar o console para jogar!");
            return;
        }
        if(super.getTemFita() && super.getTotalFitasInserida() < 750) {
            System.out.println("Você está jogando um jogo no MasterSystem");
            return;
        }
        System.out.println("Parece que o leitor queimou ou não existe uma fita inserida!");
    }

    @Override
    public void trocaDeJogo() {
        if(super.ligado) {
            System.out.println("Você precisa desligar o console para trocar de jogo!");
            return;
        }
        if(super.getTemFita()) {
            System.out.println("Você está trocando fita no MasterSystem");
            return;
        }
        System.out.println("Você precisa inserir um jogo primeiro para poder trocar de jogo!");
    }

    @Override
    public void desligar() {
        if(super.ligado) {
            System.out.println("ligando o MasterSystem");
            return;
        }
        System.out.println("Desligando o MasterSystem");
    }

    @Override
    public void ligar() {
        if(super.ligado) {
            System.out.println("Desligando o MasterSystem");
            return;
        }
        System.out.println("Ligando o MasterSystem");
    }

}
