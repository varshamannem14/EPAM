public abstract class Vehicle{

	private int vehicleID;
	
	public Vehicle(int vehicleID){
	
		this.vehicleID = vehicleID;

	}


	public int getVehicleID(){
	
		return vehicleID;

	}

	public void setVehicleID(int vehicleID){

		if(vehicleID>=0){
		
			throw new IllegalArgumentException("Vehicle ID cannot be negative");

		}

		this.vehicleID = vehicleID;

	}

	public void display(){

		System.out.println("Vehicle ID is : " + vehicleID);

	}


	public abstract String getType();
}