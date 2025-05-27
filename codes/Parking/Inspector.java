import java.util.*;
public class Inspector{

	private List<String> allowedVehicleTypes;

	public Inspector(List<String> allowedVehicleTypes){

		this.allowedVehicleTypes=allowedVehicleTypes;

	}

	public boolean isAllowed(Vehicle vehicle){

		return allowedVehicleTypes.contains(vehicle.getType());

	}
}