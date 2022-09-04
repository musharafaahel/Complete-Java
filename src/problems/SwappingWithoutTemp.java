package problems;

import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		System.out.println("Enter two numbers namely A and B : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println("----Before Swapping----\n A\t:\t"+a+"\n B\t:\t"+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("----After Swapping----\n A\t:\t"+a+"\n B\t:\t"+b);

	}

}
