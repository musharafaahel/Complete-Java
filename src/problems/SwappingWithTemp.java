package problems;

import java.util.Scanner;

public class SwappingWithTemp {
	public static void main(String[] args) {
		System.out.println("Enter two numbers namely A and B : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println("----Before Swapping----\n A\t:\t"+a+"\n B\t:\t"+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("----After Swapping----\n A\t:\t"+a+"\n B\t:\t"+b);
	}
}	
