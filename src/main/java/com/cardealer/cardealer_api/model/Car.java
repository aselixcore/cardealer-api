package com.cardealer.cardealer_api.model;

public class Car {

    private Long id;
    private String brand;
    private String model;
    private double price;
    private int mileage;

    private int displacement;
    private String drivetrain;
    private int power;
    private double torque;
    private int length;
    private int width;
    private int height;
    private int weight;
    private String aspiration;

    public Car() {
    }

    public Car(Long id, String brand, String model, double price, int mileage, int displacement,
               String drivetrain, int power, double torque, int length, int width, int height,
               int weight, String aspiration) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.displacement = displacement;
        this.drivetrain = drivetrain;
        this.power = power;
        this.torque = torque;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.aspiration = aspiration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAspiration() {
        return aspiration;
    }

    public void setAspiration(String aspiration) {
        this.aspiration = aspiration;
    }
}
