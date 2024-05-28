import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static List<Utilizator> utilizatori = new ArrayList<>();
    private static List<Licitatie> licitatii = new ArrayList<>();
    private static List<Produs> produse = new ArrayList<>();
    private static List<Oferta> oferte = new ArrayList<>();

    public static List<Utilizator> getUtilizatori() {
        return utilizatori;
    }

    public static List<Licitatie> getLicitatii() {
        return licitatii;
    }

    public static List<Produs> getProduse() {
        return produse;
    }

    public static void main(String[] args) {

        /*
        // Incarca driverul MySQL JDBC
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Nu s-a putut gasi driverul JDBC: " + e.getMessage());
            return;
        }

        // Detalii de conexiune la baza de date MySQL
        String url = "jdbc:mysql://localhost:3307/project";
        String user = "root";
        String password = "myPassword";

        // Conexiunea la baza de date
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexiunea la baza de date a fost realizata cu succes!");

        } catch (SQLException e) {
            System.err.println("Eroare la conectare la baza de date: " + e.getMessage());
        }

        */

        adaugaUtilizator("Vasile", "Ion", "VasileIon@yahoo.com", "Bucuresti, Strada Lalelelor 3", "0752284998");
        adaugaUtilizator("Popescu", "Miruna", "PopescuMiruna@gmail.com", "Ilfov, Strada Aviatiei 16", "0772981676");
        adaugaUtilizator("Lucretia", "Cristina", "LucretiaCristina@gmail.com", "Bucuresti, Strada Gladiolelor 86", "07572548294");
        adaugaUtilizator("Iris", "Luisa", "IrisLuisa@gmail.com", "Bucuresti, Soseaua Independenței 35", "07549918331");
        adaugaUtilizator("Marinescu", "Dan", "MarinescuDan@gmail.com", "Ilfov, Strada Cetății 4", "0722734489112");
        adaugaUtilizator("Antonescu", "Cristian", "AntonescuCristian@yahoo.com", "Giurgiu, Strada Iasomiei 4", "07885279088");
        adaugaUtilizator("Ciubote", "Vladimir", "CiuboteVladimir@yahoo.com", "Iasi, Strada Gladiolelor 36", "07883611738");
        adaugaUtilizator("Cristescu", "Matei-Alexadru", "CristescuMateiAlexadru@gmail.com", "Arad, Strada Trandafirilor 5", "07461128854");
        adaugaUtilizator("Popescu", "Denisa", "PopescuDenisa@gmail.com", "Bacau, Strada Anoptimpului 7", "07539188391");
        adaugaUtilizator("Cristescu", "Tudor", "CristescuTudor@yahoo.com", "Iasi, Strada Vinului 12", "07667629909");
        adaugaUtilizator("Gheorghe", "Ionut", "GheorgheIonut@yahoo.com", "Constanta, Strda Bucuriei 10", "07566510898");
        adaugaUtilizator("Dobrescu", "Irina", "DobrescuIrina@gmail.com", "Ilfov, Strada Crișan 8", "07566578821");

        System.out.println("---------------------------------------------");

        LocalDate dataInceput1 = LocalDate.of(2024, 5, 1);
        LocalDate dataSfarsit1 = LocalDate.of(2024, 5, 15);

        LocalDate dataInceput2 = LocalDate.of(2024, 6, 1);
        LocalDate dataSfarsit2 = LocalDate.of(2024, 6, 15);

        LocalDate dataInceput3 = LocalDate.of(2024, 7, 1);
        LocalDate dataSfarsit3 = LocalDate.of(2024, 7, 15);

        LocalDate dataInceput4 = LocalDate.of(2024, 8, 1);
        LocalDate dataSfarsit4 = LocalDate.of(2024, 8, 15);

        adaugaLicitatie("Licitație de Artă Decorativă", dataInceput1, dataSfarsit1, "Bucuresti");
        adaugaLicitatie("Licitație de Pictură Românească Interbelică", dataInceput2, dataSfarsit2, "Bucuresti");
        adaugaLicitatie("Licitatie de mobilier impresionant", dataInceput3, dataSfarsit3, "Cluj");
        adaugaLicitatie("Licitatie de bijuterii pretioase si ceasuri de colectie", dataInceput4, dataSfarsit4, "Bucuresti");

        System.out.println("---------------------------------------------");

        adaugaProdus("Heinrich Garossa - Bujori și hortensii", "ulei pe pânză 50 x 100 cm semnat dreapta jos, cu gri, \"Garossa\"", Categorie.TABLOURI, false, 700.0, 1);
        adaugaProdus("Gustav Mesmer - Pe lac", "ulei pe pânză 61.5 x 120 cm semnat dreapta jos, cu negru, \"G. Mesmer\"", Categorie.TABLOURI, false, 400.0, 1);
        adaugaProdus("Jules Moigniez - Fazan", "bronz 8.5 x 5 x 18 cm semnat lateral stânga, la bază, \"J. Moigniez\"", Categorie.SCULPTURI, false, 100.0, 1);
        adaugaProdus("Vittorio Tessari -  Venețiană [1885]", "ulei pe pânză 54.5 x 45 cm semnat, localizat și datat dreapta jos, cu roșu, \"V. Tessari, Venezia, 1885\"", Categorie.TABLOURI, false, 700.0, 1);
        adaugaProdus("Theodor Aman -  Intoarcerea de la camp", "Acvaforte și gravură cu acul 12.5 x 21 cm semnat stânga jos, în placă, \"Theodor Aman fac.\"", Categorie.TABLOURI, true, 800.0, 2);
        adaugaProdus("Nicolae Vermont - La targ", "Acvaforte și gravură cu acul 7.5 x 8.5 cm semnat, gravat, dreapta jos, sub cadru, ”Nicolae Vermont”; semnat stânga jos, în placă, ”NV”", Categorie.TABLOURI, true, 300.0, 2);
        adaugaProdus("Apostol Mănciulescu -  Chivuță cu basma albă", "Ulei pe carton 35.5 x 31 cm semnat stânga jos, cu negru, ”Mănciulescu”", Categorie.TABLOURI, true, 500.0, 2);
        adaugaProdus("Lot mobilier vechi în stil renascentist", "Masă sculptată manual 280x90x100 - 10 scaune sculptate manual - comodă cu 4 uși sculptată manual - comodă cu două uși sculptată manual", Categorie.MOBILIER, true, 500.0, 3);
        adaugaProdus("\"Las Flores Dalinianas\" - vitrină cu serviciu de servit masa și ceaiul", " Vitrină cu serviciu de servit masa și ceaiul, din porțelan, pentru 12 persoane, format din farfurii feluri principale, platouri, supieră, ceainic, zaharniță, letieră, cești și bomboniere [1990]", Categorie.MOBILIER, true, 900.0, 3);
        adaugaProdus("Salvador Dali - Timpul în a patra dimensiune", "bronz 66.5 x 18 x 9 cm semnat lateral dreapta, \"Dali\"", Categorie.SCULPTURI, true, 3000.0, 3);
        adaugaProdus("Brosa din argint, sub forma de libelula, decorata cu citrine, ametiste, turmaline și tanzanite", "argint 925, parțial aurit 4 citrine oval fațetate, culoare galben, claritate eye-clean, cca. 3,60 ct.; 2 ametiste pară fațetate, culoare violet, claritate eye-clean-SI, cca. 0,54 ct.; 20 turmaline oval fațetate, culoare roz, galben, verde, claritate SI, cca. 3,40 ct. și 18 tanzanite rotund fațetate, culoare violet, claritate SI, cca. 1,20 ct. 15,98 g h= 6 cm", Categorie.BIJUTERII, true, 200.0, 4);
        adaugaProdus("Lanț cu pandantiv Mikimoto din aur bicolor, decorat cu perlă Akoya", "aur galben și roz 9K 1 perlă Akoya de cultură rotundă, culoare alb, d=5,65-5,69 mm 2,09 g lanț: l=45 cm: pandantiv: d=1,1 cm", Categorie.BIJUTERII, true, 500.0, 4);
        adaugaProdus("Inel din aur roz, decorat cu safire roz", "aur roz 14K masura 56", Categorie.BIJUTERII, true, 400.0, 4);
        adaugaProdus("Ceas Rolex Datejust, din aur și oțel, cu diamante, de mână, bărbătesc [1996]", "oțel inoxidabil, aur galben 18K, diamante d=36 mm; coroana=3 mm; circumferința=19 cm", Categorie.CEASURI, true, 2000.0, 4);
        adaugaProdus("Ceas Rolex Day Date, din aur, cu diamante și cadran Stella, de mână, bărbătesc [1974]", "aur galben 18 K, diamante d=36 mm; coroana=3 mm; circumferința=15 cm", Categorie.CEASURI, true, 15000.0, 4);

        System.out.println("---------------------------------------------");

        adaugaOferta(1, 700.0, "Vasile", "Heinrich Garossa - Bujori și hortensii", "Licitație de Artă Decorativă");
        adaugaOferta(2, 750.0, "Popescu", "Heinrich Garossa - Bujori și hortensii", "Licitație de Artă Decorativă");
        adaugaOferta(3, 900.0, "Vasile", "Heinrich Garossa - Bujori și hortensii", "Licitație de Artă Decorativă");
        adaugaOferta(4, 300.0, "Lucretia", "Gustav Mesmer - Pe lac", "Licitație de Artă Decorativă");
        adaugaOferta(5, 400.0, "Vasile", "Gustav Mesmer - Pe lac", "Licitație de Artă Decorativă");
        adaugaOferta(6, 500.0, "Lucretia", "Gustav Mesmer - Pe lac", "Licitație de Artă Decorativă");
        adaugaOferta(7, 600.0, "Popescu", "Gustav Mesmer - Pe lac", "Licitație de Artă Decorativă");
        adaugaOferta(8, 700.0, "Lucretia", "Gustav Mesmer - Pe lac", "Licitație de Artă Decorativă");
        adaugaOferta(9, 500.0, "Vasile", "Jules Moigniez - Fazan", "Licitație de Artă Decorativă");
        adaugaOferta(10, 600.0, "Popescu", "Jules Moigniez - Fazan", "Licitație de Artă Decorativă");
        adaugaOferta(11, 700.0, "Lucretia", "Jules Moigniez - Fazan", "Licitație de Artă Decorativă");
        adaugaOferta(12, 800.0, "Vasile", "Jules Moigniez - Fazan", "Licitație de Artă Decorativă");
        adaugaOferta(13, 700.0, "Lucretia", "Vittorio Tessari -  Venețiană [1885]", "Licitație de Artă Decorativă");
        adaugaOferta(14, 750.0, "Vasile", "Vittorio Tessari -  Venețiană [1885]", "Licitație de Artă Decorativă");
        adaugaOferta(15, 850.0, "Popescu", "Vittorio Tessari -  Venețiană [1885]", "Licitație de Artă Decorativă");
        adaugaOferta(16, 1000.0, "Vasile", "Vittorio Tessari -  Venețiană [1885]", "Licitație de Artă Decorativă");
        adaugaOferta(17, 1200.0, "Lucretia", "Vittorio Tessari -  Venețiană [1885]", "Licitație de Artă Decorativă");

        System.out.println("---------------------------------------------");

        List<Produs> primelePatruProduse = produse.subList(0, 4);
        gasesteOfertaCastigatoare(primelePatruProduse, oferte);

        System.out.println("---------------------------------------------");

        afiseazaProduseCastigateDeUtilizatori();

        System.out.println("---------------------------------------------");

        afiseazaProduseCastigateDeUtilizator("Vasile");
        afiseazaProduseCastigateDeUtilizator("Ionescu");
        afiseazaProduseCastigateDeUtilizator("Marinescu");

        System.out.println("---------------------------------------------");

        afiseazaInformatiiProdus("Heinrich Garossa - Bujori și hortensii", produse, licitatii);

        System.out.println("---------------------------------------------");

        afiseazaInformatiiProdus("Lanț cu pandantiv Mikimoto din aur bicolor, decorat cu perlă Akoya", produse, licitatii);

        System.out.println("--------------------------------------------");


        // Categoria pe care o cautam
        Categorie categoriaCautata = Categorie.TABLOURI;

        //stocam produsele din categoria selectata
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Produsele care aparțin categoriei ").append(categoriaCautata).append(" sunt:\n");

        for (Produs produs : produse) {
            if (produs.getCategorie() == categoriaCautata) {
                stringBuilder.append("- ").append(produs.getNume()).append("\n");
            }
        }

        System.out.println(stringBuilder.toString());


        System.out.println("--------------------------------------------");

        Promovare promovare = new Promovare("Theodor Aman -  Intoarcerea de la camp");
        promovare.trimiteNotificareUtilizatori("Theodor Aman -  Intoarcerea de la camp", produse, utilizatori);

        System.out.println("--------------------------------------------");

        adaugaLicitatieOnline("Licitație de Pictură Românească Interbelică", dataInceput2, dataSfarsit2, "licitatii.ro");

        System.out.println("--------------------------------------------");


    }


    //Adaugarea unui nou utilizator
    public static void adaugaUtilizator(String nume, String prenume, String email, String adresa, String numarTelefon) {
        Utilizator utilizator = new Utilizator(nume, prenume, email, adresa, numarTelefon);
        utilizatori.add(utilizator);
        System.out.println("Utilizatorul " + nume + " " + prenume + " a fost adăugat în sistem.");
        System.out.println();
    }

    //Adaugarea unei noi licitatii
    public static void adaugaLicitatie(String descriere, LocalDate dataInceput, LocalDate dataSfarsit, String locDesfasurare) {
        Licitatie licitatie = new Licitatie(descriere, dataInceput, dataSfarsit, locDesfasurare);
        licitatii.add(licitatie);
        System.out.println("Licitația \"" + descriere + "\" a fost adăugată cu succes.");
        System.out.println();
    }

    //Adaugarea unui nou produs si asocierea acestuia unei licitatii
    public static void adaugaProdus(String nume, String descriere, Categorie categorie, boolean disponibil, double pretPornire, int idLicitatie) {
        Produs produs = new Produs(nume, descriere, categorie, disponibil, pretPornire);
        produse.add(produs);
        System.out.println("Produsul \"" + nume + "\" a fost adăugat în sistem.");
        System.out.println();

        for (Licitatie licitatie : licitatii) {
            if (licitatie.getId() == idLicitatie) {
                licitatie.adaugaProdus(produs);
                System.out.println("Produsul \"" + nume + "\" a fost asociat licitației \"" + licitatie.getDescriere() + "\".");
                System.out.println();
                return;
            }
        }

        System.out.println("Nu s-a găsit licitația cu ID-ul " + idLicitatie + ".");
        System.out.println();
    }

    //Adaugarea unei oferte pentru un produs
    public static void adaugaOferta(int idOferta, double sumaOfertata, String numeUtilizator, String numeProdus, String numeDescriere) {
        Utilizator utilizator = null;
        Produs produs = null;
        Licitatie licitatie = null;

        // Cautarea utilizatorului
        for (Utilizator u : utilizatori) {
            if (u.getNume().equals(numeUtilizator)) {
                utilizator = u;
                break;
            }
        }

        // Cautarea produsului
        for (Produs p : produse) {
            if (p.getNume().equals(numeProdus)) {
                produs = p;
                break;
            }
        }

        // Cautarea licitatiei
        for (Licitatie l : licitatii) {
            if (l.getDescriere().equals(numeDescriere)) {
                licitatie = l;
                break;
            }
        }

        // Verificarea și adăugarea ofertei
        if (utilizator != null && produs != null && licitatie != null) {
            Oferta oferta = new Oferta(idOferta, sumaOfertata, utilizator, produs, licitatie);
            oferte.add(oferta);
            licitatie.adaugaOferta(oferta);
            System.out.println("Oferta de " + sumaOfertata + " pentru produsul \"" + produs.getNume() + "\" a fost adăugată la licitația \"" + licitatie.getDescriere() + "\".");
            System.out.println();
        }
    }


    //Gasirea ofertei castiagatoare pentru un anumit produs
    private static void gasesteOfertaCastigatoare(List<Produs> produse, List<Oferta> oferte) {

        for (Produs produs : produse) {
            double ofertaMaxima = -1;
            Oferta ofertaCastigatoare = null;

            for (Oferta oferta : oferte) {
                if (oferta.getProdus().equals(produs) && oferta.getSumaOfertata() > ofertaMaxima) {
                    ofertaMaxima = oferta.getSumaOfertata();
                    ofertaCastigatoare = oferta;
                }
            }

            if (ofertaCastigatoare != null) {
                Utilizator utilizatorCastigator = ofertaCastigatoare.getUtilizator();
                utilizatorCastigator.adaugaProdusCastigat(produs);

                //Cream si setam vanzarea
                Vanzare vanzare = new Vanzare(utilizatorCastigator.getNume() + " " + utilizatorCastigator.getPrenume(), produs.getNume(), ofertaCastigatoare.getSumaOfertata());
                vanzare.setNumeCumparator(utilizatorCastigator.getNume() + " " + utilizatorCastigator.getPrenume());
                vanzare.setPretFinal(ofertaCastigatoare.getSumaOfertata());
                produs.setVanzare(vanzare);

                produs.setDisponibil(false);

                System.out.println("Oferta câștigătoare pentru produsul \"" + produs.getNume() + "\" este:");
                System.out.println("Utilizator: " + utilizatorCastigator.getNume() + " " + utilizatorCastigator.getPrenume());
                System.out.println("Suma finală: " + ofertaCastigatoare.getSumaOfertata());
                System.out.println("---------------------------------------------");
            } else {
                System.out.println("Nu există oferte pentru produsul \"" + produs.getNume() + "\".");
                System.out.println("---------------------------------------------");
            }
        }
    }


    //Afisarea produselor castigate de toti utilizatorii
    private static void afiseazaProduseCastigateDeUtilizatori() {
        for (Utilizator utilizator : utilizatori) {
            utilizator.afiseazaProduseCastigate();
            System.out.println();
        }
    }


    // Afisarea produselor castigate de un anumit utilizator
    private static void afiseazaProduseCastigateDeUtilizator(String numeUtilizator) {
        Utilizator utilizatorGasit = null;
        for (Utilizator utilizator : utilizatori) {
            if (utilizator.getNume().equals(numeUtilizator)) {
                utilizatorGasit = utilizator;
                break;
            }
        }

        // Verificam daca utilizatorul a fost gasit
        if (utilizatorGasit != null) {
            //Verificam daca utilizatorul are produse castigate
            if (utilizatorGasit.getProduseCastigate().isEmpty()) {
                System.out.println("Nu exista produse castigate de catre " + numeUtilizator + ".");
                return;
            }
            // Afisam produsele castigate de utilizatorul gasit
            utilizatorGasit.afiseazaProduseCastigate();
            System.out.println();
        } else {
            System.out.println("Nu există utilizator cu numele " + numeUtilizator + ".");
        }
    }

    public static void afiseazaInformatiiProdus(String numeProdus, List<Produs> produse, List<Licitatie> licitatii) {
        Produs produsGasit = null;
        for (Produs produs : produse) {
            if (produs.getNume().equals(numeProdus)) {
                produsGasit = produs;
                break;
            }
        }

        if (produsGasit != null) {
            System.out.println("Informatii despre produsul: " + numeProdus + ": ");
            System.out.println("Descriere: " + produsGasit.getDescriere());
            if (produsGasit.isDisponibil()) {
                System.out.println("Produsul este disponibil, va face parte dintr-o viitoare licitatie.");

                // Căutăm licitația din care face parte produsul
                Licitatie licitatieGasita = null;
                for (Licitatie licitatie : licitatii) {
                    if (licitatie.getProduse().contains(produsGasit)) {
                        licitatieGasita = licitatie;
                        break;
                    }
                }

                if (licitatieGasita != null) {
                    System.out.println("Produsul face parte din licitatia cu numele: " + licitatieGasita.getDescriere());
                    System.out.println("Pretul de pornire al produsului este: " + produsGasit.getPretPornire());
                }
            } else {
                System.out.println("Produsul nu mai este disponibil.");
                if (produsGasit.getVanzare() != null) {
                    System.out.println("A fost vandut catre: " + produsGasit.getVanzare().getNumeCumparator());
                    System.out.println("Pretul final a fost de: " + produsGasit.getVanzare().getPretFinal());
                } else {
                    System.out.println("Eroare: Produsul nu este disponibil, dar nu există informații despre vânzare.");
                }
            }
        } else {
            System.out.println("Produsul cu numele " + numeProdus + " nu a fost găsit.");
        }

    }
    public static void adaugaLicitatieOnline(String descriere, LocalDate dataInceput, LocalDate dataSfarsit, String platformaOnline){
        LicitatieOnline licitatieOnline = new LicitatieOnline(descriere, dataInceput, dataSfarsit, platformaOnline);
        licitatii.add(licitatieOnline);
        System.out.println("Licitația Online \"" + descriere + "\" a fost adăugată cu succes.");
        System.out.println();
    }

}
