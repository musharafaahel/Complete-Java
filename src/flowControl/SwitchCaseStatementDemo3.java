package flowControl;

public class SwitchCaseStatementDemo3 {
	public static void main(String[] args) {
		String name = "Aahel";
		switch (name.toLowerCase()) {
			case "aahel":
				System.out.println("You have entered1\t:\t"+name);
				break;
			case "musharaf":
				System.out.println("You have entered2\t:\t"+name);
				break;
			case "ken":
				System.out.println("You have entered3\t:\t"+name);
				break;
			default:
				System.out.println("Please enter between specified value");
				break; //break is optional for only last case or option or default
	}
}
}
