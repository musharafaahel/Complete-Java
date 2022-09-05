package inheritance;

import inheritance2.Bike;

public class Demo {
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.getHandle();
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		System.out.println(bike.getLights());
	}
}
