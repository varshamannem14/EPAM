package com.epam;

public class BasicRide implements Decorator {


    @Override
    public String getDescription() {
        return "Basic Ride";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
