import java.util.*;

public class ParkingSystem{

	public static void main(String args[]){

		List<String> allowedVehicleTypes = List.of("Car","Bike");

		Inspector inspector = new Inspector(allowedVehicleTypes);

		List<Vehicle> Vehicles = new ArrayList<>();

		Vehicle Suzuki = new Car(101);
		Vehicle Pulsar = new Bike(201);
		Vehicle BullockCart = new BullockCart(202);
		Vehicle Benz = new Car(105);

		Vehicles.add(Suzuki);
		Vehicles.add(Pulsar);
		Vehicles.add(BullockCart);
		Vehicles.add(Benz);

		ParkingSpace parking = new ParkingSpace(inspector);

		for(Vehicle vehicle : Vehicles){

			parking.parkVehicle(vehicle);

		}

	}
}