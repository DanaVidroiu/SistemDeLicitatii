public class Oferta {
    private int idOferta;
    private double sumaOfertata;
    private Utilizator utilizator;
    private Produs produs;
    private Licitatie licitatie;

    public Oferta(int idOferta, double sumaOfertata, Utilizator utilizator, Produs produs, Licitatie licitatie) {
        this.idOferta = idOferta;
        this.sumaOfertata = sumaOfertata;
        this.utilizator = utilizator;
        this.produs = produs;
        this.licitatie = licitatie;
    }

    public int getIdOferta() {
        return this.idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public double getSumaOfertata() {
        return this.sumaOfertata;
    }

    public void setSumaOfertata(double sumaOfertata) {
        this.sumaOfertata = sumaOfertata;
    }

    public Utilizator getUtilizator() {
        return this.utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public Produs getProdus() {
        return this.produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public Licitatie getLicitatie() {
        return this.licitatie;
    }

    public void setLicitatie(Licitatie licitatie) {
        this.licitatie = licitatie;
    }
}
