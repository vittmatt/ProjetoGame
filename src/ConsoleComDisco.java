public class ConsoleComDisco {
    private boolean temDisco;
    private int totalDiscosInserido;
    protected boolean ligado;

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
