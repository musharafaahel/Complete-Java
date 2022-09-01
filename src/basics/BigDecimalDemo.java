package basics;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		double x = 1.05;
		double y = 2.55; 
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(x+y);
		System.out.println(d1.add(d2));
		//Need to learn more about this
	}

}
