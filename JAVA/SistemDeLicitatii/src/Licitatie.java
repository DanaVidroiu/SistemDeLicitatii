import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Licitatie {
    private static int contor = 1;
    private int id;
    protected List<Produs> produse;
    public String descriere;
    public LocalDate dataInceput;
    public LocalDate dataSfarsit;
    public String locDesfasurare;
    private Map<Produs, List<Oferta>> oferte;

    public Licitatie(String descriere, LocalDate dataInceput, LocalDate dataSfarsit, String locDesfasurare) {
        this.id = contor++;
        this.produse = new ArrayList();
        this.descriere = descriere;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.locDesfasurare = locDesfasurare;
        this.oferte = new HashMap();
    }

    public int getId() {
        return this.id;
    }

    public List<Produs> getProduse() {
        return this.produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }

    public String getDescriere() {
        return this.descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public LocalDate getDataInceput() {
        return this.dataInceput;
    }

    public void setDataInceput(LocalDate dataInceput) {
        this.dataInceput = dataInceput;
    }

    public LocalDate getDataSfarsit() {
        return this.dataSfarsit;
    }

    public void setDataSfarsit(LocalDate dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public String getLocDesfasurare() {
        return this.locDesfasurare;
    }

    public void setLocDesfasurare(String locDesfasurare) {
        this.locDesfasurare = locDesfasurare;
    }

    protected void adaugaProdus(Produs produs) {
        this.produse.add(produs);
        this.oferte.put(produs, new ArrayList());
    }

    public void adaugaOferta(Oferta oferta) {
        Produs produs = oferta.getProdus();
        if (this.oferte.containsKey(produs)) {
            ((List)this.oferte.get(produs)).add(oferta);
        } else {
            System.out.println("Produsul nu face parte din aceasta licitatie.");
        }

    }
}

