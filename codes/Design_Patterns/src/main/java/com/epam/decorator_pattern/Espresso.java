package com.epam.decorator_pattern;

public class Espresso extends Coffee{

    public Espresso(){
        description = "Espresso";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
