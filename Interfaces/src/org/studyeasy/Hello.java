package org.studyeasy;

import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone = new Iphone8();
		System.out.println("Processor :"+phone.processor());
		

	}

}
