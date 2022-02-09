public class ConsoleComDisco {
    private boolean temDisco;
    private static int totalDiscoInserido;

    public void insereDisco() {
        if (temDisco) {
            System.out.println("Já existe um disco!");
            return;
        }
        temDisco = true;
        totalDiscoInserido++;
        System.out.println("Disco inserido.");
    }

    public void ejetaDisco() {
        temDisco = false;
        System.out.println("Disco ejetado.");
    }

    public boolean getTemDisco() {
        return temDisco;
    }

    public static int getTotalDiscoInserido() {
        return totalDiscoInserido;
    }

}
