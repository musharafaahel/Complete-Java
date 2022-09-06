package inheritance2;

import inheritance1.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle = "Short";
	}

	public String getHandle() {
		return handle;
	}

	public Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}
	
}
