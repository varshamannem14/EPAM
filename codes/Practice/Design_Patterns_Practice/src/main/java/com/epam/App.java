package com.epam;

public class App 
{
    public static void main( String[] args ) {

        Ride ride1 = new Ride.Builder()
                        .setSource("S")
                        .setDestination("D")
                        .setFare(20)
                        .setDriverName("Raju")
                        .setVehicleType("Car")
                        .build();

        System.out.println(ride1);

        Vehicle rideVehicle = new VehicleFactory().getVehicle(ride1.vehicleType);

        System.out.println(rideVehicle.start());

        FareCalculator fareCalculator = new FareCalculator(new CarFareStrategy());

        double totalFare = fareCalculator.calculateFare(10)+ ride1.fare;

        System.out.println(totalFare);

        RideObserver passenger = new PassengerApp("Bob");
        RideObserver driver = new DriverApp(ride1.driverName);

        ride1.addObserver(passenger);
        ride1.addObserver(driver);

        ride1.setStatus("Started");
        ride1.setStatus("In Progress");
        ride1.setStatus("Completed");

        BasicRide ride = new BasicRide();

        Decorator luxuryRide = new LuxuryPackage(ride);

        System.out.println(luxuryRide.getCost());
        System.out.println(luxuryRide.getDescription());




    }
}
