package Methods;

public class MethodsDemo2 {
	
	void loop1() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	
	static void loop2() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+ "loop2");
		}
	}
	public static void main(String[] args) {
		//loop1(); Static Reference (Cannot make static reference to non static method)
		//MethodsDemo2.loop1();
		MethodsDemo2 md2 = new MethodsDemo2();
		md2.loop1();
		md2.loop1();
		
		//Static Reference
		loop2();
		MethodsDemo2.loop2();
	}
}
