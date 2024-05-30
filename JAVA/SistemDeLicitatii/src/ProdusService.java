import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdusService {
    private Connection connection;

    public ProdusService(Connection connection) {
        this.connection = connection;
    }


    public void createProdus(Produs produs) throws SQLException {
        String sql = "INSERT INTO produs (nume, descriere, categorie, disponibil, pretPornire) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produs.getNume());
            stmt.setString(2, produs.getDescriere());
            stmt.setString(3, produs.getCategorie().name());
            stmt.setBoolean(4, produs.isDisponibil());
            stmt.setDouble(5, produs.getPretPornire());
            stmt.executeUpdate();
        }
    }


    public Produs readProdus(int id) throws SQLException {
        String sql = "SELECT * FROM produs WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Produs(
                        rs.getString("nume"),
                        rs.getString("descriere"),
                        Categorie.valueOf(rs.getString("categorie")),
                        rs.getBoolean("disponibil"),
                        rs.getDouble("pretPornire")
                );
            } else {
                return null;
            }
        }
    }


    public void updateProdus(Produs produs) throws SQLException {
        String sql = "UPDATE produs SET nume = ?, descriere = ?, categorie = ?, disponibil = ?, pretPornire = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produs.getNume());
            stmt.setString(2, produs.getDescriere());
            stmt.setString(3, produs.getCategorie().name());
            stmt.setBoolean(4, produs.isDisponibil());
            stmt.setDouble(5, produs.getPretPornire());
            stmt.setInt(6, produs.getId());
            stmt.executeUpdate();
        }
    }


     public void deleteProdus(int id) throws SQLException {
        String sql = "DELETE FROM produs WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
     }
}
