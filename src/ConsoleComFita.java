public class ConsoleComFita {

    private boolean temFita;
    private int totalFitasInserida;
    protected boolean ligado;

    public void insereFita() {
        if (temFita) {
            System.out.println("Já existe uma Fita!");
            return;
        }
        temFita = true;
        totalFitasInserida++;
        System.out.println("Fita Inserida.");
    }

    public void retiraFita() {
        temFita = false;
        System.out.println("Você retirou a fita.");
    }

    public boolean getTemFita() {
        return temFita;
    }

    public int getTotalFitasInserida() {
        return totalFitasInserida;
    }

}
