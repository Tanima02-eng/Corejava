package app.demo;

/*Program -1 Write a program to print factorial of N ( without using any loop)
 * 
 */

class Factorialapp {
	static int fact(int n) {
		if (n == 1)
			return 1;
		return n * fact(n - 1);
	}
}

public class Factorial {
	public static void main(String args[]) {
		Factorialapp factorial = new Factorialapp();
		int result = factorial.fact(3);
		System.out.println(result);
	}
}
