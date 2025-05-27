package com.epam;

public class LuxuryPackage extends RideDecorator{

    public LuxuryPackage(Decorator decorator){
        super(decorator);
    }

    @Override
    public String getDescription(){
        return decorator.getDescription() + "Luxury Package";
    }

    @Override
    public double getCost(){
        return decorator.getCost()+100;
    }


}
