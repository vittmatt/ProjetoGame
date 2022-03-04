package br.com.projetoGame.classes;

import br.com.projetoGame.enums.OnOff;

public class ConsoleComDisco {
    private boolean temDisco;
    private int totalDiscosInserido;
    protected OnOff state;

    public void insereDisco() {
        if (temDisco) {
            System.out.println("Já existe um disco!");
            return;
        }
        temDisco = true;
        totalDiscosInserido++;
        System.out.println("Disco inserido.");
    }

    public void ejetaDisco() {
        temDisco = false;
        System.out.println("Disco ejetado.");
    }

    public boolean getTemDisco() {
        return temDisco;
    }

    public int getTotalDiscosInserido() {
        return totalDiscosInserido;
    }

    public OnOff getState() {
        return state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }

}
