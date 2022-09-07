package main;

import main.phone.Nokia;

import main.phone.Phone;
import main.phone.Samsung;

public class Hello {
	public static void main(String[] args) {
		/*
		 * Phone phone = new Phone("Nokia 3310"); System.out.println(phone.getModel());
		 * phone.features();
		 * 
		 * SamsungNote8 note8 = new SamsungNote8("Note 8");
		 * System.out.println(note8.getModel()); note8.feature();
		 */
		
		/*
		 * Phone note8 = new Samsung("Note 8"); System.out.println(note8.getModel());
		 * note8.features();
		 * 
		 * Phone nokia = new Nokia("Nokia 3310"); System.out.println(nokia.getModel());
		 */
		
		Phone nokia3310 = new Hello().phone(1); //if not static
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
		Phone samsungNote8 = new Hello().phone(2);
		System.out.println(samsungNote8.getModel());
		samsungNote8.features();
		
		
		//Phone nokia3310 = phone(1); if static
		
	}
	
	
	public  Phone phone(int dialyDriver) {
		switch(dialyDriver) {
			case 1:return new Nokia("3310");
			case 2:return new Samsung("Note 8"); 
		}
		return null;
	}
}
