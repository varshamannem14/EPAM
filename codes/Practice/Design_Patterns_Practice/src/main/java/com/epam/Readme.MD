Scenario: Ride-Sharing Application 🚖


You are designing a ride-sharing application like Uber. Each question introduces a different design pattern to enhance the system.


1️⃣ Builder Pattern
Question: Implement a Ride class using the Builder pattern. 
The Ride should have attributes like source, destination, vehicleType, fare, and driverName.
Ensure that the object is immutable once built.


2️⃣ Factory Pattern
Question: Create a VehicleFactory that generates different types of vehicles 
(Car, Bike, AutoRickshaw) based on user preference. 
The factory should return an appropriate object for each type.


3️⃣ Strategy Pattern
Question: Implement a FareCalculator using the Strategy pattern. 
The fare calculation should vary based on the vehicle type 
(CarFareStrategy, BikeFareStrategy, AutoFareStrategy).


4️⃣ Observer Pattern
Question: Design an RideObserver system where passengers and drivers are notified
of ride status changes (e.g., RideStarted, RideInProgress, RideCompleted). 
Ensure that multiple observers (such as PassengerApp, DriverApp) can subscribe/unsubscribe dynamically.


5️⃣ Decorator Pattern
Question: Extend the Ride functionality using the Decorator pattern to support
additional ride features like LuxuryPackage (leather seats, music), 
WiFiEnabledRide, and PetFriendlyRide.