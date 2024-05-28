import java.time.LocalDate;
import java.util.List;

public class Produs {
    private int id;
    public String nume;
    public String descriere;
    public Categorie categorie;
    private boolean disponibil;
    public double pretPornire;
    private Vanzare vanzare;

    public Produs(String nume, String descriere, Categorie categorie, boolean disponibil, double pretPornire) {
        this.nume = nume;
        this.descriere = descriere;
        this.categorie = categorie;
        this.disponibil = disponibil;
        this.pretPornire = pretPornire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return this.descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }

    public double getPretPornire() {
        return this.pretPornire;
    }

    public void setPretPornire(double pretPornire) {
        this.pretPornire = pretPornire;
    }


    public void setVanzare(Vanzare vanzare) {
        this.vanzare = vanzare;
    }

    public Vanzare getVanzare() {
        return this.vanzare;
    }

}

 