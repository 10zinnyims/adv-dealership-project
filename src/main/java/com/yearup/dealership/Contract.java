package com.yearup.dealership;

public abstract class Contract {
    private String Date;
    private String name;
    private String email;
    private int vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String name, String email, int vehicleSold) {
        Date = date;
        this.name = name;
        this.email = email;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(int vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
    public abstract double getTotalPrice();
    private abstract double getMonthlyPayment();
}
