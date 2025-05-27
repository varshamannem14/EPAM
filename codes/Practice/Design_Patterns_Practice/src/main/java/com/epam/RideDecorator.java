package com.epam;

public abstract class RideDecorator implements Decorator{

    public Decorator decorator;

    public RideDecorator(Decorator decorator){
        this.decorator=decorator;
    }


    @Override
    public  String getDescription() {
        return decorator.getDescription();
    }

    @Override
    public double getCost() {
        return decorator.getCost();
    }


}
