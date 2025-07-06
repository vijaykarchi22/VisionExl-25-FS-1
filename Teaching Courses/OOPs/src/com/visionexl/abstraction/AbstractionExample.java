package com.visionexl.abstraction;


/**
 * Calculate the area of the given shape
 * Shape - circle - 2 * pi * r
 * Shape - Rectangle -> width * breadth
 * Shape - Triangle -> 1/2 * height * base
 * Shape - Square -> side * side
 */
public class AbstractionExample {

    public static void main(String[] args) {

        Circle circle = new Circle(2.0);
        System.out.println("Calculated Area is : " + circle.calculateArea());

        System.out.println("======================= INTERFACE (PURE ABSTRACTION)");
        Shape shapeCircle = new Circle(10.0);
        System.out.println("Calculated Area is : " + shapeCircle.calculateArea());

        System.out.println("======================= ABSTRACT CLASS (IMPURE ABSTRACTION)");
        AbstractShape abstractShapeCircle = new AbstractSquare(10.0);
        System.out.println("calculated Area is : " + abstractShapeCircle.calculateArea());
        System.out.println("calculated Arc Area is : " + abstractShapeCircle.calculateArcArea());

    }
}
