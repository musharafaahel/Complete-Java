package problems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number to find sum of digits : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int Dnum = num;
		
		int sum = 0;
		
		while(Dnum != 0) {
			sum = sum + (Dnum % 10);
			Dnum = Dnum / 10;
		}
		System.out.println("Sum of Digits : "+sum);

	}

}
