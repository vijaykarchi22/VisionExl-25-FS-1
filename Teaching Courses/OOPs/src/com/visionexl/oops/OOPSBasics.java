package com.visionexl.oops;

public class OOPSBasics {

    public static void main(String[] args) {
        /**
         * Objects -> instance of a class. (Real entity that is present in the memory)
         * TO create the object we use new keyword
         */

        Car car = new Car(); // constructor

        car.startEngine();
        car.releaseHandBrake();
        car.changeGear();
        car.accelerate();
        System.out.println("-======================= Default");
        Car defaultCar = new Car();
        System.out.println(defaultCar.getColor());

        System.out.println();
        System.out.println("======================== coloured");
        Car colouredCar = new Car("RED");
        System.out.println(colouredCar.getColor());

    }
}
