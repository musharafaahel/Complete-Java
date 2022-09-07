package animal;

public class Animal {
	protected int heightInFeets;
	protected int weightInKilos;
	protected String animalType;
	protected String bloodType;
	
	public Animal() {
		this.heightInFeets = 0;
		this.weightInKilos = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}

	public Animal(int height, int weight, String animalType, String bloodType) {
		super();
		this.heightInFeets = height;
		this.weightInKilos = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public String showInfo() {
		return "Animal [heightInFeets=" + heightInFeets + ", weightInKilos=" + weightInKilos + ", animalType="
				+ animalType + ", bloodType=" + bloodType + "]";
	}


	
	

	
	
}
