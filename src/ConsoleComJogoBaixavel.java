public class ConsoleComJogoBaixavel {

    private int quantidadeJogosBaixado;
    protected OnOff state;
    protected OnOff on = OnOff.ON;
    protected OnOff off = OnOff.OFF;

    public boolean jogoBaixado() {
        if(quantidadeJogosBaixado > 0) {
            return true;
        }
        return false;
    }

    public void baixarJogo() {
        if(state == off) {
            System.out.println("Você precisa ligar o console para baixar algum jogo");
            return;
        }
        quantidadeJogosBaixado++;
        System.out.println("Baixando jogo");
    }

    public void desinstalarJogo() {
        if(isJogoBaixado()) {
            System.out.println("Não existe jogo para desinstalar!");
        }
        if(state == off) {
            System.out.println("Você precisa ligar o console para desinstalar algum jogo");
            return;
        }
        quantidadeJogosBaixado--;
        System.out.println("Desinstalando jogo");
    }

    public boolean isJogoBaixado() {
        return jogoBaixado();
    }

    public int getQuantidadeJogosBaixado() {
        return quantidadeJogosBaixado;
    }

}
