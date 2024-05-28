import java.time.LocalDate;

public class Vanzare {
    private String numeCumparator;
    private String numeProdus;
    private double pretFinal;

    // Constructor
    public Vanzare(String numeCumparator, String numeProdus, double pretFinal) {
        this.numeCumparator = numeCumparator;
        this.numeProdus = numeProdus;
        this.pretFinal = pretFinal;
    }

    public String getNumeCumparator() {
        return numeCumparator;
    }

    public void setNumeCumparator(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPretFinal() {
        return pretFinal;
    }

    public void setPretFinal(double pretFinal) {
        this.pretFinal = pretFinal;
    }
}

