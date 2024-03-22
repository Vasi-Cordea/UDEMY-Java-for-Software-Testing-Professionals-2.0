package OOP;

public class Calculations {

	int num1;
	int num2;
	int sum, product;

	void calculate(int num1, int num2) {  // function or method
		sum = num1 + num2;
		product = num1 * num2;

		System.out.println("sum is: " + sum);
		System.out.println("product is: " + product);
	}

	public static void main(String[] args) {
		
		Calculations cal = new Calculations();  // object instantiations
		cal.calculate(3,2);
		cal.calculate(5,5);
		cal.calculate(9,22);
	
	}
}