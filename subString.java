/*
 * Working of substring function
 * 
 */

import java.util.Scanner;

public class subString {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String input = sc.nextLine();
			String result = input.substring(2,input.length()); // Enter beginning index , end index (or any index you need)
			System.out.println(result);
			sc.close();
		}
}
