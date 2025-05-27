package com.epam;

public class CarFareStrategy implements FareStrategy {

    @Override
    public double calculate(double distance) {
        return distance*10;
    }
}
