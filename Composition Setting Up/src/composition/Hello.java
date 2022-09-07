package composition;

import composition.laptop.Laptop;
import composition.laptop.components.GraphicsCard;
import composition.laptop.components.Processor;

public class Hello {
	public static void main(String[] args) {
//		Laptop laptop = new Laptop();
//		System.out.println(laptop.getProcessor().getBrand()); // getting property of object of object
	
//		Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6MB", "2.5GHz","2.5GHz" , "3.1GHZ");
//		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, new Processor("intel", "7200u", 7, 4, 4, "6MB", "2.5GHz","2.5GHz" , "3.1GHZ"), "DDR4", new GraphicsCard("Nvidia", 1050, "4GB"), null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}
}
