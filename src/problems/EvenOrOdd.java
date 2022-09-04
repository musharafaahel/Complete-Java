package problems;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number to find Even or Odd : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num % 2 == 0)
			System.out.println(num+" Even Number");
		else
			System.out.println(num+ " Odd Number" );
	}
}
