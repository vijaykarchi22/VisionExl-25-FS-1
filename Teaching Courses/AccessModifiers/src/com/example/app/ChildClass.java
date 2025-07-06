package com.example.app;

public class ChildClass extends Modifiers {

    // ROI  + Amout
    public double calculateCompleteAmount() {
        return calculateInterest() + amount;
    }

    public double calculateWaveOffFromChild() {
        double totalAmount = amount + calculateInterest();
        return totalAmount * (waveOffCharge / 100);
//        return calculateWaveOff();
    }

//    public String getAcctNumber() {
//        return accountNumber;
//    }

}
