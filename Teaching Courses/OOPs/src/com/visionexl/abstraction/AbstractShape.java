package com.visionexl.abstraction;

public abstract class AbstractShape {

    abstract double calculateArea();

    double calculateArcArea() {
        System.out.println("This method is not applicable for the given shape");
        return 0.0;
    }
}
