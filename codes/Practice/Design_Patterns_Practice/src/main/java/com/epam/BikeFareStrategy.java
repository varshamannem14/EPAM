package com.epam;

public class BikeFareStrategy implements FareStrategy {
    @Override
    public double calculate(double distance) {
        return distance * 5;
    }
}
