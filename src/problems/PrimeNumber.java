package problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter to check prime or not : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		boolean isPrime = true;
		for(int i = 2; i < num;i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(num+" Prime Number");
		}
		else {
			System.out.println(num+" Not Prime Number");
		}
		
	}

}
