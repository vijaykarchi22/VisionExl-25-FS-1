package com.example.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Access Modifiers");


        // public modifier
        Modifiers modifier = new Modifiers();
        System.out.println("Interest rate is : " + modifier.calculateInterest());
        System.out.println("Waveoff : (Protected) : " +modifier.calculateWaveOff());
        System.out.println("Loan amount (default) : " + modifier.getLoanAmount());
        System.out.println(modifier.getAcctNumber());

        ChildClass childClass = new ChildClass();
        System.out.println("Complete Amount is : " +childClass.calculateCompleteAmount());
        System.out.println("Protected child : " + childClass.calculateWaveOffFromChild());
        System.out.println(childClass.getLoanAmount());

    }
}