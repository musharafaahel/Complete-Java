package flowControl;

public class SwitchCaseStatementDemo2 {
	public static void main(String[] args) {
		// float x = 1.1f (Not Allowed)
		char x = 'c'; // (Allowed)
		switch (x) {
		case 'A':
		case 'a':
			System.out.println("You have entered\t:\t"+x);
			break;
		case 'B':
		case 'b':
			System.out.println("You have entered\t:\t"+x);
			break;
		case 'C':
		case 'c':
			System.out.println("You have entered\t:\t"+x);
			break;
		default:
			System.out.println("Please enter between specified value");
			break; //break is optional for only last case or option or default
	}
	}
}
