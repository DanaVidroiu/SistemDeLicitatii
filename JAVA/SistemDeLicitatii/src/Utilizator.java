import java.util.ArrayList;
import java.util.List;

class Utilizator {
    public String nume;
    public String prenume;
    public String email;
    public String adresa;
    public String numarTelefon;
    public List<Produs> produseCastigate;

    public Utilizator(String nume, String prenume, String email, String adresa, String numarTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
        this.produseCastigate = new ArrayList();
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public void setPrenume(String prenume) {

        this.prenume = prenume;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return this.adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNumarTelefon() {
        return this.numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void adaugaProdusCastigat(Produs produs) {
        this.produseCastigate.add(produs);
    }

    public List<Produs> getProduseCastigate() {
        return this.produseCastigate;
    }

    public void afiseazaProduseCastigate() {
        System.out.println("Produse castigate de " + this.nume + " " + this.prenume + ":");
        for(Produs produs : this.produseCastigate) {
            System.out.println("- " + produs.getNume());
        }
    }
}