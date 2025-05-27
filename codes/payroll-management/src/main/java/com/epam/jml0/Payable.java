package com.epam.jml0;

public interface Payable {
    double calculatePay();
    default void displayCalculate(){
        System.out.println("Calculating payment");
    }
}
