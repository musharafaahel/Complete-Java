package animal.reptile;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg = "Hard Shelled";
		
	}


	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeets="
				+ heightInFeets + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	
}
