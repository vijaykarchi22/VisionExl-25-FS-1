package com.example.app;

public class Modifiers {
    public double amount = 200.0;
    public double roi = 5.67;

    // Protected
    protected double waveOffCharge = 0.25;

    // default
    double loanAmount;

    //private
    private String accountNumber = "ICIC123456";

    public double calculateInterest() {
        return amount * (roi / 100);
    }

    protected double calculateWaveOff() {
        double totalAmount = amount + calculateInterest();
        return totalAmount * (waveOffCharge / 100);
    }


    // default
    double getLoanAmount() {
        return loanAmount;
    }

    // private
    private String getAccountNumber() {
        return accountNumber;
    }

    public String getAcctNumber() {
        return accountNumber;
    }





}
