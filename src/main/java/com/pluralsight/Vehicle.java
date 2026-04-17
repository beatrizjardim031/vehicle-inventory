package com.pluralsight;

public class Vehicle {
    //fields are the class "properties"
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReader;
    private double price;

    // constructor initializes the to-be object (builds the vehicle object with its data)
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReader, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReader = odometerReader;
        this.price = price;
    }

    //  getters (reads a value from the variable) and setters (updates a value from the variable)
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
