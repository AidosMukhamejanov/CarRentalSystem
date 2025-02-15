
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class BookingService {

    public void bookVehicle(int vehicleId, int customerId, String startDate, String endDate, double totalAmount) {
        String sql = "INSERT INTO Bookings (vehicle_id, customer_id, start_date, end_date, total_amount) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManagement.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Преобразование строк в дату
            Date sqlStartDate = Date.valueOf(startDate);
            Date sqlEndDate = Date.valueOf(endDate);

            pstmt.setInt(1, vehicleId);
            pstmt.setInt(2, customerId);
            pstmt.setDate(3, sqlStartDate);
            pstmt.setDate(4, sqlEndDate);
            pstmt.setDouble(5, totalAmount);

            pstmt.executeUpdate();
            System.out.println("Booking successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}