package classOOP;

public class Car {
	//Properties or State 
		private String doors;
		private String engine;   
		private String driver;
		private int speed; 
	
	public Car(String doors, String engine, String driver, int speed) {
			this.doors = doors;
			this.engine = engine;
			this.driver = driver;
			this.speed = speed;
		}


	//Constructor
	public Car() {
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
	 
	
	public String getDoors() {
		return doors;
	}

	/*
	 * public void setDoors(String doors) { this.doors = doors; }
	 */
	public String getEngine() {
		return engine;
	}
	/*
	 * public void setEngine(String engine) { this.engine = engine; }
	 */

	/*
	 * public String getDriver() { return driver; }
	 */
	/*
	 * public void setDriver(String driver) { this.driver = driver; }
	 */
	public int getSpeed() {
		return speed;
	}
	/*
	 * public void setSpeed(int speed) { this.speed = speed; }
	 */
	
	
	//Behaviour or Functionality
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0)
		{
			return "running";
		}else {
			return "not running";
		}
	}
	

	
}
