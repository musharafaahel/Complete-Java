package Methods;

public class MethodOverloading {
	public static double area(double l, double b) {
		return l*b;
	}
	public static double area(double s) {
		return s*s;
	}
	
	public static void main(String[] args) {
		System.out.println("Area of Rectangle : "+area(10,10));
		System.out.println("Area of Square : "+area(10));
	}
}
