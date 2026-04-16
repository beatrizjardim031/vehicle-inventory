package com.pluralsight;

public class Vehicle {
    //fields
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReader;
    private double price;

    // constructor
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReader, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReader = odometerReader;
        this.price = price;
    }

    // getters and setters
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReader() {
        return odometerReader;
    }

    public void setOdometerReader(int odometerReader) {
        this.odometerReader = odometerReader;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
