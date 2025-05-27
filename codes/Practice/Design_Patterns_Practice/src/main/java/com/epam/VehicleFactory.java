package com.epam;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {

        if(vehicleType==null) return null;
        switch (vehicleType) {
            case "Car":
                return new Car();

            case "Bike":
                return new Bike();

            case "Auto":
                return new AutoRickshaw();

            default:
                throw new IllegalArgumentException("Unknown vehicle Type");
        }
    }
}
