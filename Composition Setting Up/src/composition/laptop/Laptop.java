package composition.laptop;

import composition.laptop.components.Processor;
import composition.laptop.components.GraphicsCard;

public class Laptop {
	
	private float screen;
	private Processor processor; //Complex Properties
	private String name;
	private GraphicsCard graphicsCard; //Complex Properties
	private String opticalDrive;
	private String keyboard;
	
	public Laptop(float f, Processor processor2, String string, GraphicsCard graphicsCard2, Object object, String string2) {
		this.screen = 15.6f;
		this.processor = new  Processor(); //Anonymous object
		this.name = "DDR4";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MultiLayer";
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String name, GraphicsCard graphicsCard, String opticalDrive,
			String keyboard) {
		
		this.screen = screen;
		this.processor = processor;
		this.name = name;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", name=" + name + ", graphicsCard="
				+ graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public float getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getName() {
		return name;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
	
	public String gamingMode() {
		processor.setFrequency(processor.getMaxfrequency());
		return "Success";
	}
	
}
