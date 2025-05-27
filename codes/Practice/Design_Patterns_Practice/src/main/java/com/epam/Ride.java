package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Ride {

    public static class Builder{
        private String source;
        private String destination;
        private String vehicleType;
        private double fare;
        private String driverName;

        public Builder setSource(String source){
            this.source=source;
            return this;
        }

        public Builder setDestination(String destination){
            this.destination=destination;
            return this;
        }

        public Builder setVehicleType(String vehicleType){
            this.vehicleType=vehicleType;
            return this;
        }

        public Builder setFare(double fare){
            this.fare=fare;
            return this;
        }

        public Builder setDriverName(String driverName){
            this.driverName=driverName;
            return this;
        }

        public Ride build(){
            return new Ride(this);
        }



    }

    public final String source;
    public final String destination;
    public final String vehicleType;
    public final double fare;
    public final String driverName;



    public Ride(Builder builder) {

        this.source=builder.source;
        this.destination= builder.destination;
        this.vehicleType= builder.vehicleType;
        this.fare=builder.fare;
        this.driverName= builder.driverName;

    }

    public String getSource() {return source;}

    public String getDestination() {return destination;}

    public String getVehicleType() {return vehicleType;}

    public double getFare() {return fare;}

    public String getDriverName() {return driverName;}

    @Override
    public String toString() {
        return "Ride{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", fare=" + fare +
                ", driverName='" + driverName + '\'' +
                '}';
    }

    List<RideObserver> rideObservers = new ArrayList<>();

    private String status;

    public void addObserver(RideObserver rideObserver){
        rideObservers.add(rideObserver);
    }

    public void removeObserver(RideObserver rideObserver){
        rideObservers.remove(rideObserver);
    }

    public void setStatus(String status){
        this.status = status;
        notifyObservers();
    }

    public void notifyObservers(){
        for(RideObserver rideObserver : rideObservers){
            rideObserver.update(status);
        }
    }
}
