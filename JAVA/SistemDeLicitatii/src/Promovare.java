import java.util.List;

public class Promovare {
    private String numeProdusPromovat;

    public Promovare(String numeProdusPromovat) {
        this.numeProdusPromovat = numeProdusPromovat;
    }


    protected void trimiteNotificareUtilizatori(String numeProdus, List<Produs> produse, List<Utilizator> utilizatori) {
        Produs produs = null;
        for (Produs p : produse) {
            if (p.getNume().equals(numeProdus)) {
                produs = p;
                break;
            }
        }

        if (produs == null) {
            System.out.println("Produsul cu numele " + numeProdus + " nu a fost găsit.");
            return;
        }

        for (Utilizator utilizator : utilizatori) {
            String subiect = "Un nou produs care te-ar putea interesa!";
            StringBuilder continut = new StringBuilder("Bună ziua, " + utilizator.getNume() + " " + utilizator.getPrenume() + ",\n\n");
            continut.append("Avem un produs pe care credem că te-ar putea interesa:\n\n");

            continut.append("Denumire: ").append(produs.getNume()).append("\n");
            continut.append("Descriere: ").append(produs.getDescriere()).append("\n");
            continut.append("Categorie: ").append(produs.getCategorie()).append("\n");
            continut.append("Preț Pornire: ").append(produs.getPretPornire()).append("\n");
            continut.append("\n");

            continut.append("Cu drag,\nCasa de Licitatii\n\n");
            continut.append("------------------");

            trimiteEmail(utilizator.getEmail(), subiect, continut.toString());
        }
    }

    // Metoda pentru trimiterea email-ului
    protected static void trimiteEmail(String emailDestinatar, String subiect, String continut) {
        System.out.println("Trimitere email către: " + emailDestinatar);
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: \n" + continut);
    }

}
