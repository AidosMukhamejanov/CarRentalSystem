import java.util.Scanner;
public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();
        BookingService bookingService = new BookingService();
        BillingSerivce billingService = new BillingSerivce();

        while (true) {
            System.out.println("\n=== Car Rental System ===");
            System.out.println("1. View Available Vehicles");
            System.out.println("2. Book a Vehicle");
            System.out.println("3. Generate Invoice");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    vehicleService.checkAvailability();
                    break;
                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    int vehicleId = scanner.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter End Date (YYYY-MM-DD): ");
                    String endDate = scanner.nextLine();
                    bookingService.bookVehicle(vehicleId, customerId, startDate, endDate, choice);
                    break;
                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = scanner.nextInt();
                    billingService.generateInvoice(bookingId);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
