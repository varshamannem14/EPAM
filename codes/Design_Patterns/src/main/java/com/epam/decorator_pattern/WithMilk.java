package com.epam.decorator_pattern;

public class WithMilk extends CoffeeDecorator{

    Coffee coffee;

    public WithMilk(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " Milk";
    }

    @Override
    public double cost() {
        return coffee.cost()+0.50;
    }
}
