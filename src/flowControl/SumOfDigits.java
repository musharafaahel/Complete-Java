package flowControl;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int sod = 0;
		while(true) {
			sod = sod + (n%10);
			n = n /10;
			if(n < 10) {
				break;
			}
		}
		sod = sod + n;
		System.out.println(sod);
	}
}
