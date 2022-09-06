package inheritance;

import inheritance2.Bike;
import inheritance2.Car;
import inheritance2.Truck;

public class Demo {
	public static void main(String[] args) {
		
		Bike bike = new Bike("long","Deisel",4,4,40,"LED");
		System.out.println(bike);
		Car car = new Car("Round", "Radio", "Seat AC", "Seat Fridge", "Seat Movie Panel");
		System.out.println(car);

		Truck truck = new Truck();
		System.out.println(truck);
		
	}
}
