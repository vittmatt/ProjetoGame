public class ConsoleComJogoBaixavel {

    private int quantidadeJogosBaixado;
    private OnOff state;

    public boolean jogoBaixado() {
        if(quantidadeJogosBaixado > 0) {
            return true;
        }
        return false;
    }

    public void baixarJogo() {
        if(this.state.equals(OnOff.OFF)) {
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
        if(this.state.equals(OnOff.OFF)) {
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

    public OnOff getState() {
        return state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }
}
