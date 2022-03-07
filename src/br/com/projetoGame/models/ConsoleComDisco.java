package br.com.projetoGame.models;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.DiscoInvalidException;

public class ConsoleComDisco {
    private boolean temDisco;
    private int totalDiscosInserido;
    protected OnOff state;

    public void insereDisco() throws DiscoInvalidException {
        if (this.temDisco) {
            throw new DiscoInvalidException("Já existe um disco!");
        }
        this.temDisco = true;
        this.totalDiscosInserido++;
        System.out.println("Disco inserido.");
    }

    public void ejetaDisco() {
        this.temDisco = false;
        System.out.println("Disco ejetado.");
    }

    public boolean getTemDisco() {
        return this.temDisco;
    }

    public int getTotalDiscosInserido() {
        return this.totalDiscosInserido;
    }

    public OnOff getState() {
        return this.state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }

}
