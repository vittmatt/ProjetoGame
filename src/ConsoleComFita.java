import java.util.ArrayList;

public class ConsoleComFita {

    private boolean temFita;
    private int totalFitasInserida;
    protected OnOff state;

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

    public OnOff getState() {
        return state;
    }

    public void setState(OnOff state) {
        this.state = state;
    }
}
