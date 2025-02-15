package org.example;

public class Vehicle {
    private Integer vehicleId;
    private String make;
    private String model;
    private Integer year;
    private Boolean isAvailable;
    private Double dailyRate;
    
    public Vehicle(Integer vehicleId, String make, String model, Integer year, Boolean isAvailable, Double dailyRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAvailable = isAvailable;
        this.dailyRate = dailyRate;
    }

    public Integer getVehicleId() { return vehicleId; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public Integer getYear() { return year; }
    public Boolean getIsAvailable() { return isAvailable; }
    public Double getDailyRate() { return dailyRate; }

    public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }
}
