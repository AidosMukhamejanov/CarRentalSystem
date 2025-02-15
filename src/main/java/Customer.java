package org.example;

public class Customer {
    private Integer customerId;
    private String name;
    private String email;
    private String phone;

    public Customer(Integer customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}