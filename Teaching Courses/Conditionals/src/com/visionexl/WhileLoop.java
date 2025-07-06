package com.visionexl;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        int factorial = 1;
        while (i >= 1) {
            factorial = factorial * i;
            i--;
        }

        // do - while
        do {
            factorial = factorial * i;
            i--;
        } while (i >= 1);


    }
}
