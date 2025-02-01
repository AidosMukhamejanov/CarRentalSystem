import org.postgresql.ds.PGPooledConnection;

import java.sql.*;

public class BillingSerivce {
    public void generateInvoice(int bookingId) {
        String query = "SELECT b.booking_id, v.make, v.model, b.start_date, b.end_date, b.total_amount " +
                "FROM Bookings b INNER JOIN Vehicles v ON b.vehicle_id = v.vehicle_id WHERE b.booking_id = ?";

        try (Connection conn = DatabaseManagement.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, bookingId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Booking ID: " + rs.getInt("booking_id"));
                System.out.println("Vehicle: " + rs.getString("make") + " " + rs.getString("model"));
                System.out.println("Start Date: " + rs.getDate("start_date"));
                System.out.println("End Date: " + rs.getDate("end_date"));
                System.out.println("Total Amount: $" + rs.getDouble("total_amount"));
            } else {
                System.out.println("No booking found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}