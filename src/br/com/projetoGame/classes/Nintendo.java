package br.com.projetoGame.classes;

import br.com.projetoGame.comparators.JogoNintendoComparator;
import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.*;
import br.com.projetoGame.interfaces.ConsoleComJogoBaixavel;

import java.util.*;
public class Nintendo implements ConsoleComJogoBaixavel {

    private Jogo jogoAtual;
    private OnOff state = OnOff.OFF;
    private Set<Jogo> jogos = new TreeSet<Jogo>(new JogoNintendoComparator());
    private Map<String, Jogo> nomeParaJogo = new HashMap<>();

    @Override
    public void baixarJogo(Jogo jogo) throws JogoInvalidException, ConsoleInvalidException {
        if (this.state.equals(OnOff.OFF)) {
            throw new ConsoleInvalidException("Você precisa ligar o console para baixar algum jogo");
        }
        if (this.jogos.contains(jogo)) {
            throw new JogoInvalidException("Jogo já baixado");
        }

        this.jogos.add(jogo);
        this.nomeParaJogo.put(jogo.getNome(), jogo);
        System.out.println("Baixando " + jogo.getNome());
    }

    @Override
    public Jogo desinstalarJogo(String jogoParaDesinstalar) throws JogoInvalidException {
        if(this.jogoAtual != null) {
            if (Objects.equals(this.jogoAtual.getNome(), jogoParaDesinstalar)) {
                System.out.println("Fechando " + this.jogoAtual.getNome());
                this.jogoAtual = null;
            }
        }
        if (this.state.equals(OnOff.OFF)) {
            throw new JogoInvalidException("Você precisa ligar o console para desinstalar algum jogo");
        }

        if (this.jogos.size() == 0) {
            throw new JogoInvalidException("Não existe jogo para desinstalar!");
        }

        if(this.nomeParaJogo.get(jogoParaDesinstalar) == null){
            throw new JogoInvalidException("Jogo não encontrado");
        }

        System.out.println("Desinstalando " + jogoParaDesinstalar);
        this.jogos.remove(this.nomeParaJogo.get((jogoParaDesinstalar)));
        return this.nomeParaJogo.get(jogoParaDesinstalar);
    }

    @Override
    public void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException {
        if (this.nomeParaJogo.get(jogoAntigo) == null) throw new JogoInvalidException("Jogo não encontrado");
        this.nomeParaJogo.replace(jogoAntigo, novoJogo);
    }

    @Override
    public Jogo buscarJogo(String jogoBuscado) throws JogoInvalidException {
        if (this.nomeParaJogo.get(jogoBuscado) == null) throw new JogoInvalidException("Jogo não encotrado");
        return this.nomeParaJogo.get(jogoBuscado);
    }

    @Override
    public void joga() throws JogoInvalidException, ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ConsoleInvalidException("Você precisa ligar o Nintendo para jogar!");
        }
        if (this.getQuantidadeJogosBaixado() == 0) {
            throw new JogoInvalidException("Você precisa baixar algum jogo para jogar");
        }

        if (this.jogoAtual == null) {
            throw new JogoInvalidException("Você precisa abrir algum jogo primeiro para poder jogar!");
        }

        System.out.println("Jogando " + this.jogoAtual.getNome());
    }

    @Override
    public void abrirJogo(String jogo) throws TrocaJogoInvalidaException, JogoInvalidException, ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) {
           throw new ConsoleInvalidException("Nintendo está desligado");
        }

        if (this.nomeParaJogo.get(jogo) == null) {
            throw new TrocaJogoInvalidaException("Você precisa especificar o jogo a ser aberto");
        }

        if (!this.getJogos().contains(this.nomeParaJogo.get(jogo))) {
            throw new JogoInvalidException("Você não tem esse jogo baixado");
        }

        if (this.jogoAtual != null) {
            System.out.println("Você está trocando de " + jogoAtual.getNome() + " Para " + jogo);
            this.jogoAtual = this.nomeParaJogo.get(jogo);
        }

        if (this.jogoAtual == null) {
            System.out.println("Você está abrindo " + jogo);
            this.jogoAtual = this.nomeParaJogo.get(jogo);
        }

    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) {
            throw new ImpossivelDesligarException("Console já desligado");
        }
        System.out.println("Nintendo desligado");
        this.setState(OnOff.OFF);
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) {
            throw new ImpossivelLigarException("Console já ligado");
        }
        this.setState(OnOff.ON);
        System.out.println("Nintendo ligado");
    }

    public int getQuantidadeJogosBaixado() {
        return this.jogos.size();
    }

    public OnOff getState() {
        return this.state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }

    public Set<Jogo> getJogos() {
        return Collections.unmodifiableSet(this.jogos);
    }

}
