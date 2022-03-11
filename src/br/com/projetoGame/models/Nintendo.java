package br.com.projetoGame.models;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.*;
import br.com.projetoGame.interfaces.ConsoleComJogoBaixavel;

import java.util.*;
import java.util.stream.Collectors;

public class Nintendo implements ConsoleComJogoBaixavel {
    private Optional<Jogo> jogoAtual = Optional.empty();
    private OnOff state = OnOff.OFF;
    private Map<String, Optional<Jogo>> jogos = new TreeMap<>();

    @Override
    public void baixarJogo(Jogo jogo) throws Exception {
        if (this.state.equals(OnOff.OFF)) throw new ConsoleInvalidException("Você precisa ligar o console para baixar algum jogo");

        if (this.jogos.containsKey(jogo.getNome())) throw new JogoInvalidException("Jogo já baixado");

        this.jogos.put(jogo.getNome(), Optional.of(jogo));
        System.out.println("Baixando " + jogo.getNome());
    }

    @Override
    public void desinstalarJogo(String jogoParaDesinstalar) throws JogoInvalidException {
        if (this.state.equals(OnOff.OFF)) throw new JogoInvalidException("Você precisa ligar o console para desinstalar algum jogo");

        if (this.jogos.size() == 0) throw new JogoInvalidException("Não existe jogo para desinstalar!");

        if (!this.jogos.get(jogoParaDesinstalar).isPresent()) throw new JogoInvalidException("Jogo não encontrado");

        jogoAtual.ifPresent(jogo -> {
            if (jogo.getNome().equals(jogoParaDesinstalar)) {
                System.out.println("Fechando " + jogo.getNome());
                this.jogoAtual = Optional.empty();
            }
        });

        System.out.println("Desinstalando " + jogoParaDesinstalar);
        this.jogos.remove(jogoParaDesinstalar);
    }

    @Override
    public void atualizarJogo(String jogoAntigo, Jogo novoJogo) throws JogoInvalidException {
        if (!this.jogos.get(jogoAntigo).isPresent()) throw new JogoInvalidException("Jogo não encontrado");

        this.jogos.replace(jogoAntigo, Optional.of(novoJogo));
    }

    @Override
    public Jogo buscarJogoPeloNome(String jogoBuscado) throws JogoInvalidException {
        if (!this.jogos.get(jogoBuscado).isPresent()) throw new JogoInvalidException("Jogo não encotrado");

        return this.jogos.get(jogoBuscado).get();
    }

    public Jogo buscarJogoPeloGenero(String genero) {
        return this.jogos.values().stream()
                .filter(jogo -> Objects.equals(jogo.get().getGenero(), genero))
                .distinct()
                .map(Optional::get)
                .collect(Collectors.toList())
                .get(0);
    }

    public Jogo buscarJogoPeloAnoDeLancamento(int anoDeLancamento) {
        return this.jogos.values().stream()
                .filter(jogo -> jogo.get().getDataDeLancamento().getYear() == anoDeLancamento)
                .distinct()
                .map(Optional::get)
                .collect(Collectors.toList())
                .get(0);
    }

    @Override
    public void joga() throws JogoInvalidException, ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) throw new ConsoleInvalidException("Você precisa ligar o Nintendo para jogar!");

        if (this.getQuantidadeJogosBaixado() == 0) throw new JogoInvalidException("Você precisa baixar algum jogo para jogar");

        if (!this.jogoAtual.isPresent()) throw new JogoInvalidException("Você precisa abrir algum jogo primeiro para poder jogar!");

        System.out.println("Jogando " + this.jogoAtual.get().getNome());
    }

    @Override
    public void abrirJogo(String jogo) throws JogoInvalidException, ConsoleInvalidException {
        if (this.getState().equals(OnOff.OFF)) throw new ConsoleInvalidException("Nintendo está desligado");

        if (!this.jogos.get(jogo).isPresent()) throw new JogoInvalidException("Você não tem esse jogo baixado");

        if (this.jogoAtual.isPresent()) {
            System.out.println("Você está trocando de " + jogoAtual.get().getNome() + " Para " + jogo);
            this.jogoAtual = this.jogos.get(jogo);
        }

        if (!this.jogoAtual.isPresent()) {
            System.out.println("Você está abrindo " + jogo);
            this.jogoAtual = this.jogos.get(jogo);
        }

    }

    public void fecharJogo() {
        this.jogoAtual = Optional.empty();
    }

    @Override
    public void desligar() throws ImpossivelDesligarException {
        if (this.getState().equals(OnOff.OFF)) throw new ImpossivelDesligarException("Console já desligado");

        System.out.println("Nintendo desligado");
        this.state = OnOff.OFF;
    }

    @Override
    public void ligar() throws ImpossivelLigarException {
        if (this.getState().equals(OnOff.ON)) throw new ImpossivelLigarException("Console já ligado");

        this.state = OnOff.ON;
        System.out.println("Nintendo ligado");
    }

    public int getQuantidadeJogosBaixado() {
        return this.jogos.size();
    }

    public OnOff getState() {
        return this.state;
    }

    public Object getJogos() {
        return List.of(
                jogos.values().stream()
                        .map(Optional::get)
                        .collect(Collectors.groupingBy(jogo -> jogo.getDataDeLancamento().getYear()))
        ).get(0);
    }

}
