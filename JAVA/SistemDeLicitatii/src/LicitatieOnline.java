import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

class LicitatieOnline extends Licitatie {
    private String platformaOnline;

    public LicitatieOnline(String descriere, LocalDate dataInceput, LocalDate dataSfarsit, String platformaOnline) {
        super(descriere, dataInceput, dataSfarsit, null);
        this.platformaOnline = platformaOnline;
    }

    @Override
    public String getLocDesfasurare() {
        return "Licitatia se desfasoara online!";
    }

    public String getPlatformaOnline() {
        return platformaOnline;
    }

    public void setPlatformaOnline(String platformaOnline) {
        this.platformaOnline = platformaOnline;
    }

    public void conectarePlatforma() {
        System.out.println("Conectare la platforma online: " + platformaOnline);
    }

    public void licitatieOnline() {
        System.out.println("Începe licitația online pe platforma: " + platformaOnline);
    }
}