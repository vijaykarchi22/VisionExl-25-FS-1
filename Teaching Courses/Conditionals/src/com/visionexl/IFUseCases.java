package com.visionexl;

public class IFUseCases {
    public static void main(String[] args) {
        int a = 50;
        int b = 10;
        int c = 60;
        if (b > a) { // ==, !=, >, < ,>= and <=
            System.out.println("if block is true");
        } else {
            System.out.println("Its the else block");
        }

        if( a < b) {
            System.out.println("a < b");
        } else if (a > c)  {
            System.out.println(" a > c");
        } else if (b < c) {
            System.out.println("b < c");
        } else {
            System.out.println("else block");
        }


        System.out.println("This is the end of program");




    }

}
