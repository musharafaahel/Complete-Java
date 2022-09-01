package flowControl;

import java.util.Scanner;

public class SwitchCaseStatementDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number Between 1 to 3 :");
		int x = scan.nextInt();
		scan.close();
		
//		//Using If Statement
//		if(x == 1) {
//			System.out.println("You have entered\t:\t"+x);
//		}
//		else if(x == 2) {
//			System.out.println("You have entered\t:\t"+x);
//		}
//		else if(x == 3) {
//			System.out.println("You have entered\t:\t"+x);
//		}
//		else {
//			System.out.println("Please enter between specified value");
//		}
		
		// Alternative way is Switch Case
		
		switch (x) {
			case 1:
				System.out.println("You have entered\t:\t"+x);
				break;
			case 2:
				System.out.println("You have entered\t:\t"+x);
				break;
			case 3:
				System.out.println("You have entered\t:\t"+x);
				break;
			default:
				System.out.println("Please enter between specified value");
				break; //break is optional for only last case or option or default
		}
	}
}
