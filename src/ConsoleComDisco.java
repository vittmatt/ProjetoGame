public class ConsoleComDisco {
    private boolean temDisco;
    private int totalDiscosInserido;
    protected OnOff state;
    protected OnOff on = OnOff.ON;
    protected OnOff off = OnOff.OFF;

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

}
