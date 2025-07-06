package com.visionexl;

public class SwitchUseCases {

    public static void main(String[] args) {

        String sportType = "FOOTBALL";
        int number = 1;

        switch (number) {
            case 1: {
                System.out.println("Cricket");
                break;
            }

            case 2: {
                System.out.println("Foot Ball");
                break;
            }

            default: {
                System.out.println("Given sport is not listed");
            }
        }

    }
}
