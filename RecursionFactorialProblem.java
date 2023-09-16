/*
 * Factorial of any number using Recursive function
 */
import java.util.Scanner;
public class RecursionFactorialProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("Factorial of " + n + " is " +result);
		sc.close();

	}

	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
		
		
	}

}
