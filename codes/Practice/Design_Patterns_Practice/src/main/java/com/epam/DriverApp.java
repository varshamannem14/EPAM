package com.epam;

public class DriverApp implements RideObserver{

    private String name;

    public DriverApp(String name){
        this.name = name;
    }
    @Override
    public void update(String status) {
        System.out.println("Driver "+ name +" notified : Ride is "+status);
    }
}
