package inheritance;

import inheritance2.Bike;

public class Demo {
	public static void main(String[] args) {
		
		Bike bike = new Bike("long","Deisel",4,4,40,"LED");
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		System.out.println(bike.getFuelTank());
		System.out.println(bike.getSeats());
		System.out.println(bike.getLights());

		
	}
}
