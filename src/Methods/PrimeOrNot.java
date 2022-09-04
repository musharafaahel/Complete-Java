package Methods;

public class PrimeOrNot {

	public static void main(String[] args) {
		PrimeOrNot p = new PrimeOrNot();
		if(p.isPrime(7.5))
			System.out.println("Number Passed is Prime");
		else
			System.out.println("Number Passed is not Prime");
	}
	
	
	public boolean isPrime(int num) {
		boolean isNumPrime = true;
		for(int i=2;i < num;i++) {
			if(num % i == 0) {
				isNumPrime = false;
				break;
			}
		}
		return isNumPrime;
	}
	public boolean isPrime(double num) {
		boolean isNumPrime = true;
		for(double i=2;i < num;i++) {
			if(num % i == 0) {
				isNumPrime = false;
				break;
			}
		}
		return isNumPrime;
	}
}


