package flowControl;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		scan.close();
		boolean isPrime = true;
		for(int i = 2; i <  number; i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number+" is Prime Number");
		}else if(!isPrime) {
			System.out.println(number+" is not Prime Number");
		}
	}
}
