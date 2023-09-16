/*
 * Sum of 'n' natural number using recursion
 */
import java.util.Scanner;

public class RecurisonExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int result = sum(k);
		System.out.println(result);
		sc.close();
	}

	private static int sum(int k) {
		// TODO Auto-generated method stub
		if(k > 0) {
			return k + sum(k-1);
		}else {
			return 0;
		}
	}

}
