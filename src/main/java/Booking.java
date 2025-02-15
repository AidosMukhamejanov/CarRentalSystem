package org.example.models;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int vehicleId;
    private int customerId;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalAmount;

    public Booking(int bookingId, int vehicleId, int customerId, LocalDate startDate, LocalDate endDate, double totalAmount) {
        this.bookingId = bookingId;
        this.vehicleId = vehicleId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() { return bookingId; }
    public int getVehicleId() { return vehicleId; }
    public int getCustomerId() { return customerId; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public double getTotalAmount() { return totalAmount; }
}
