package inheritance2;

import inheritance1.Vehicle;

public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	public Truck() {
		super();
		this.steering = "Round";
		this.musicSystem = "Front Radio";
		this.airConditioner = "Window AC";
		this.container = 2;
	}
	public Truck(String steering, String musicSystem, String airConditioner, int container) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public int getContainer() {
		return container;
	}
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}
	
	
}
