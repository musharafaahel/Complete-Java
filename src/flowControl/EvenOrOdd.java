package flowControl;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number : ");
		int n = scan.nextInt();
		scan.close();
		
		if(n%2 == 0) {
			System.out.println(n+" is Even");
		}else {
			System.out.println(n+" is Odd");
		}
	}
}
