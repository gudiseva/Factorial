package mytest.factorial;

import myclass.factorial.Factorial;

public class Tester {

	public Tester() {}

	public static void main(String[] args) {

		int number = 4;
		Factorial factorial = new Factorial();
		int result = factorial.factorial(number);
		System.out.println("Factorial of " + number + " = " + result);

	}

}
