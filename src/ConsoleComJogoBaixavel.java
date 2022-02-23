import java.util.ArrayList;

public class ConsoleComJogoBaixavel {

    private OnOff state = OnOff.OFF;
    private ArrayList<String> jogos = new ArrayList<>();

    public void baixarJogo(String jogo) {
        if(this.state.equals(OnOff.OFF)) {
            System.out.println("Você precisa ligar o console para baixar algum jogo");
            return;
        }
        if(jogos.contains(jogo)) {
            System.out.println("Jogo já baixado");
            return;
        }

        jogos.add(jogo);
        System.out.println("Baixando " + jogo);
        arrayOrdemAlfabetica();
    }

    public void desinstalarJogo(String jogo) {
        if(this.state.equals(OnOff.OFF)) {
            System.out.println("Você precisa ligar o console para desinstalar algum jogo");
            return;
        }

        if(jogos.size() == 0) {
            System.out.println("Não existe jogo para desinstalar!");
        }

        for(int i = 0; i < this.jogos.size(); i++) {
            if(this.jogos.get(i).equals(jogo)) {
                this.jogos.remove(i);
                System.out.println("Desinstalando " + jogo);
                return;
            }
            System.out.println("Jogo não encontrado");
        }
    }

    public void atualizarJogo(String jogoAntigo, String novoJogo) {
        for(int i = 0; i < this.jogos.size(); i++) {
            if(this.jogos.get(i).equals(jogoAntigo)) {
                this.jogos.set(i, novoJogo);
                System.out.println(jogoAntigo + "atualizado para" + novoJogo);
                arrayOrdemAlfabetica();
            }
        }
        System.out.println("Jogo não encontrado");
    }

    public String buscarJogo(String jogo) {
        for (String s : this.jogos) {
            if (s.equals(jogo)) {
                return s;
            }
        }
        return "Jogo não encontrado";
    }

    public void arrayOrdemAlfabetica() {
        this.jogos.sort((j1, j2) -> j1.compareTo(j2));
    }

    public int getQuantidadeJogosBaixado() {
        return jogos.size();
    }

    public OnOff getState() {
        return this.state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }

    public ArrayList<String> getJogos() {
        return jogos;
    }
}
