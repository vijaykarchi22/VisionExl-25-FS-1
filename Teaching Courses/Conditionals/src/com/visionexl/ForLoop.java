package com.visionexl;

public class ForLoop {

    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        /*
        *
        * *
        * * *
        * * * *
         */

//        for (int i = 1; i <= 4; i++) {
//            if( i == 1) {
//                System.out.println("*");
//            }
//
//            if( i == 2) {
//                System.out.println("* *");
//            }
//
//            if( i == 3) {
//                System.out.println("* * *");
//            }
//
//            if( i == 4) {
//                System.out.println("* * * *");
//            }
//        }
        /*
         *
         * *
         * * *
         * * * *
         */
        for (int row = 1; row <= 4; row++ ) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // Calculate factorial of given number n;
        // 4! = 4*3*2*1 = 24
        /**
         * fact = 1
         * 4 -> fact * 4 = 4
         * 3 -> fact * 3 = 12
         */
        int factorial = 1;
        for (int i = 4; i > 1; i--) {
            System.out.println("number is " + i);
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);
        System.out.println("=-=========================================");
        for(int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("action is called for i "+i);
        }

        for(int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("action is called for i (break) "+i);
        }

    }
}
