import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LicitatieService {
    private Connection connection;

    public LicitatieService(Connection connection) {
        this.connection = connection;
    }

    public void createLicitatie(Licitatie licitatie) throws SQLException {
        String sql = "INSERT INTO licitatie (descriere, dataInceput, dataSfarsit, locDesfasurare) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, licitatie.getDescriere());
            stmt.setDate(2, Date.valueOf(licitatie.getDataInceput()));
            stmt.setDate(3, Date.valueOf(licitatie.getDataSfarsit()));
            stmt.setString(4, licitatie.getLocDesfasurare());
            stmt.executeUpdate();
        }
    }

    public Licitatie readLicitatie(int id) throws SQLException {
        String sql = "SELECT * FROM licitatie WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Licitatie licitatie = new Licitatie(
                        rs.getString("descriere"),
                        rs.getDate("dataInceput").toLocalDate(),
                        rs.getDate("dataSfarsit").toLocalDate(),
                        rs.getString("locDesfasurare")
                );
                return licitatie;
            }
        }
        return null;
    }

    // Update
    public void updateLicitatie(Licitatie licitatie) throws SQLException {
        String sql = "UPDATE licitatie SET descriere = ?, dataInceput = ?, dataSfarsit = ?, locDesfasurare = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, licitatie.getDescriere());
            stmt.setDate(2, Date.valueOf(licitatie.getDataInceput()));
            stmt.setDate(3, Date.valueOf(licitatie.getDataSfarsit()));
            stmt.setString(4, licitatie.getLocDesfasurare());
            stmt.setInt(5, licitatie.getId());
            stmt.executeUpdate();
        }
    }

    // Delete
    public void deleteLicitatie(int id) throws SQLException {
        String sql = "DELETE FROM licitatie WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
             stmt.setInt(1, id);
             stmt.executeUpdate();
        }
    }

}
