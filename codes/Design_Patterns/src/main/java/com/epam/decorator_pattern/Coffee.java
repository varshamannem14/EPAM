package com.epam.decorator_pattern;

public abstract class Coffee {

    String description = "Unknown Coffee";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
