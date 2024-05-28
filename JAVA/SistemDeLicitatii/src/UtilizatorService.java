import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtilizatorService {
    private Connection connection;

    public UtilizatorService(Connection connection) {
        this.connection = connection;
    }

    public void adaugaUtilizator(Utilizator utilizator) throws SQLException {
        String query = "INSERT INTO Utilizator (nume, prenume, email, adresa, numar_telefon) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, utilizator.getNume());
            statement.setString(2, utilizator.getPrenume());
            statement.setString(3, utilizator.getEmail());
            statement.setString(4, utilizator.getAdresa());
            statement.setString(5, utilizator.getNumarTelefon());
            statement.executeUpdate();
        }
    }

    public Utilizator citesteUtilizator(String email) throws SQLException {
        String query = "SELECT * FROM Utilizator WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Utilizator utilizator = new Utilizator(
                            resultSet.getString("nume"),
                            resultSet.getString("prenume"),
                            resultSet.getString("email"),
                            resultSet.getString("adresa"),
                            resultSet.getString("numar_telefon")
                    );
                    return utilizator;
                }
            }
        }
        return null;
    }

    public void actualizeazaUtilizator(Utilizator utilizator) throws SQLException {
        String query = "UPDATE Utilizator SET nume = ?, prenume = ?, adresa = ?, numar_telefon = ? WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, utilizator.getNume());
            statement.setString(2, utilizator.getPrenume());
            statement.setString(3, utilizator.getAdresa());
            statement.setString(4, utilizator.getNumarTelefon());
            statement.setString(5, utilizator.getEmail());
            statement.executeUpdate();
        }
    }

    public void stergeUtilizator(String email) throws SQLException {
        String query = "DELETE FROM Utilizator WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
            statement.executeUpdate();
        }
    }
}
