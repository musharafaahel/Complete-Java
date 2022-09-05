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

	public Bike(String handle) {
		super();
		this.handle = handle;
	}
	
}
