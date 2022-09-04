package Methods;

public class MethodsDemo3 {
	String name;
	int age;
	long number;
	private void setDetials(String name, int age, long number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	private void getDetails() {
		System.out.println(name + " "+age+" "+number);
	}
	
	public static void main(String[] args) {
		MethodsDemo3 md3 = new MethodsDemo3();
		md3.setDetials("Aahel", 21, 9962702756L);
		md3.getDetails();
	}
}
