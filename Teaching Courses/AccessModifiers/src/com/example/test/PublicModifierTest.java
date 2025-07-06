package com.example.test;

import com.example.app.ChildClass;
import com.example.app.Modifiers;

public class PublicModifierTest {

    public static void main(String[] args) {

        // public modifier
        Modifiers modifier = new Modifiers();
        System.out.println("Interest rate is from different package : " + modifier.calculateInterest());

//        ClassFromDifferentPackage classFromDifferentPackage = new ClassFromDifferentPackage();
//        System.out.println(classFromDifferentPackage.protectedFromDifferentPackage());

//        ChildClass childClass = new ChildClass();
//        childClass.getLoanAmount();
    }
}
