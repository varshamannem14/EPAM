import java.util.*;

public class ParkingSpace{

	

	public Inspector inspector;

	public ParkingSpace(Inspector inspector){
	
		this.inspector = inspector;
	}

	
	public void parkVehicle(Vehicle vehicle){

		if(inspector.isAllowed(vehicle)){
			
			System.out.println("Parking is allowed for "+vehicle.getType()+" with vehicle ID " + vehicle.getVehicleID());

		}

		else{

			System.out.println("Parking is not allowed for "+vehicle.getType());

		}

	}


	
}