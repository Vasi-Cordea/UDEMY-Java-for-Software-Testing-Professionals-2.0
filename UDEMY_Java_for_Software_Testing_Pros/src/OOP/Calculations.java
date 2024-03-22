package OOP;

public class Calculations {

	int num1; // parameters
	int num2;
	int sum, product;

	int calculate(int num1, int num2) { // function or method
		sum = num1 + num2;
		return sum;

		// product = num1 * num2;
		// System.out.println("sum is: " + sum);
		// System.out.println("product is: " + product);
	}

	public static void main(String[] args) {
		int result;
		Calculations cal = new Calculations(); // object instantiations
	//	cal.calculate(3, 2);

		result = cal.calculate(2, 2) + 5;
		System.out.println(result);
	}
}