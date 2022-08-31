package basics;

public class OperatorDemo6 {
	public static void main(String[] args) {
		int x = 10;
		x +=x;
		System.out.println(x);
		
		int y =0;
		
		y -= x; // y = y - x;
		System.out.println(y);
	
		x *= 10;
		System.out.println(x);
		
		x /= 10;
		System.out.println(x);
		
		x %= 10;
		System.out.println(x);
	}
}
