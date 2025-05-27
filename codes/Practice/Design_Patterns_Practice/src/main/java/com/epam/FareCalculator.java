package com.epam;

public class FareCalculator {

    private FareStrategy fareStrategy;

    public FareCalculator(FareStrategy fareStrategy){
        this.fareStrategy=fareStrategy;
    }

    public double calculateFare(double distance){
        return fareStrategy.calculate(distance);
    }
}
