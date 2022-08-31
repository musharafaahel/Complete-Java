package basics;

import java.math.BigDecimal;

public class BigDecimalDemo2 {

	public static void main(String[] args) {
		
		// float datatype division
		float f1 = 11.1234567f;
		float f2 = 3.66f;
		System.out.println("f1 /f2 = "+(f1/f2));
		
		// double datatype division
		double d1 = 11.1234567d;
		double d2 = 3.66d;
		System.out.println("d1 /d2 = "+(d1/d2));
		
		//BigDecimal datatype division
		BigDecimal b1 = new BigDecimal("11.1234567");
		BigDecimal b2 = new BigDecimal("3.66");
		System.out.println(b1.add(b2));
	}

}
