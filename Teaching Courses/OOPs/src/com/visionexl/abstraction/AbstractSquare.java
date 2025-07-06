package com.visionexl.abstraction;

public class AbstractSquare extends AbstractShape {

    private double side;

    public AbstractSquare(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }
}
