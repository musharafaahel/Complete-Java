package main;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	
	
	
	public Person() {
		this.name = "John Doe";
		this.age = 25;
		this.gender = "Male";
	}


	public boolean setAge(int age) {
		if(age >= 0 && age <=100) {
			this.age = age;
			return true;
		}else
			return false;
	}


	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
