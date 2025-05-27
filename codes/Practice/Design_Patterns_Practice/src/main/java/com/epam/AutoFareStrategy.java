package com.epam;

public class AutoFareStrategy implements FareStrategy {

    @Override
    public double calculate(double distance) {
        return distance*6;
    }
}
