import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleService {
    public void checkAvailability() {
        String query = "SELECT * FROM Vehicles WHERE is_available = TRUE";

        try (Connection conn = DatabaseManagement.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("Vehicle ID: " + rs.getInt("vehicle_id") +
                        ", Make: " + rs.getString("make") +
                        ", Model: " + rs.getString("model") +
                        ", Daily Rate: " + rs.getDouble("daily_rate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}