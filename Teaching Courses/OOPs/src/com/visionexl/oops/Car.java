package com.visionexl.oops;

/**
 * A class is a blueprint - data members and the behaviour
 * POJOs -> Plain Old Java Objects
 */
public class Car {
    // data members
    private String color;
    private int enginePower;
    private float mileage;
    private String brand;

    // constructor - Default / non-parameterized
    public Car() {
        System.out.println("Car instance is being created");
        this.color = "WHITE";
    }

    // Prameterized constructor
    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    // Getters / Setters
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getColor() {
        return this.color;
    }


    // actions
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void releaseHandBrake() {
        System.out.println("Handbrake is released");
    }

    public void changeGear() {
        System.out.println("Gear is changed");
    }

    public void accelerate() {
        System.out.println("Car started moving");
    }
}
