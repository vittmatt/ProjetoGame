package br.com.projetoGame.models;

import br.com.projetoGame.enums.OnOff;
import br.com.projetoGame.exceptions.FitaInvalidException;

public class ConsoleComFita {

    private boolean temFita;
    private int totalFitasInserida;
    protected OnOff state;

    public void insereFita() throws FitaInvalidException {
        if (this.temFita) {
            throw new FitaInvalidException("Já existe uma Fita!");
        }
        this.temFita = true;
        this.totalFitasInserida++;
        System.out.println("Fita Inserida.");
    }

    public void retiraFita() {
        this.temFita = false;
        System.out.println("Você retirou a fita.");
    }

    public boolean getTemFita() {
        return this.temFita;
    }

    public int getTotalFitasInserida() {
        return this.totalFitasInserida;
    }

    public OnOff getState() {
        return this.state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }
}
