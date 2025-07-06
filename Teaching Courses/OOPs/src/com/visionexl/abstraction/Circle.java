package com.visionexl.abstraction;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * 3.141 * this.radius;
    }


}
