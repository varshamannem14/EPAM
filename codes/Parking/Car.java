public class Car extends Vehicle{

	public Car(int vehicleID){

		super(vehicleID);

	}

	@Override
	public String getType(){
		
		return "Car";

	}

}