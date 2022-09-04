package Methods;

public class AreaOfRectangle {
	double calculateAOR(double length, double breadth) {
		return (length * breadth);
	}
	
	public static void main(String[] args) {
		AreaOfRectangle aor = new AreaOfRectangle();
		double value = aor.calculateAOR(10, 10);
		System.out.println("Area of Rectangle : "+value);
	}
}
