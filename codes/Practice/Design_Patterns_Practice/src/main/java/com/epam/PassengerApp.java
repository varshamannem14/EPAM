package com.epam;

public class PassengerApp implements RideObserver{
    private String name;

    public PassengerApp(String name){
        this.name=name;
    }
    @Override
    public void update(String status) {
        System.out.println("Passenger "+name + " notified: Ride is "+status);
    }
}
