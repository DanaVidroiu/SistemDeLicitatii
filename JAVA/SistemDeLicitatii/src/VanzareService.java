import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VanzareService {
    private Connection connection;

    public VanzareService(Connection connection) {
        this.connection = connection;
    }

    public void createVanzare(Vanzare vanzare) throws SQLException {
        String sql = "INSERT INTO vanzare (numeCumparator, numeProdus, pretFinal) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, vanzare.getNumeCumparator());
            stmt.setString(2, vanzare.getNumeProdus());
            stmt.setDouble(3, vanzare.getPretFinal());
            stmt.executeUpdate();
        }
    }

    public Vanzare readVanzare(String numeCumparator, String numeProdus) throws SQLException {
        String sql = "SELECT * FROM vanzare WHERE numeCumparator = ? AND numeProdus = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, numeCumparator);
            stmt.setString(2, numeProdus);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Vanzare(
                        rs.getString("numeCumparator"),
                        rs.getString("numeProdus"),
                        rs.getDouble("pretFinal")
                );
            } else {
                return null;
            }
        }
    }

    public void updateVanzare(Vanzare vanzare) throws SQLException {
        String sql = "UPDATE vanzare SET pretFinal = ? WHERE numeCumparator = ? AND numeProdus = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, vanzare.getPretFinal());
            stmt.setString(2, vanzare.getNumeCumparator());
            stmt.setString(3, vanzare.getNumeProdus());
            stmt.executeUpdate();
        }
    }

    public void deleteVanzare(String numeCumparator, String numeProdus) throws SQLException {
        String sql = "DELETE FROM vanzare WHERE numeCumparator = ? AND numeProdus = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
             stmt.setString(1, numeCumparator);
             stmt.setString(2, numeProdus);
             stmt.executeUpdate();
        }
    }

}
