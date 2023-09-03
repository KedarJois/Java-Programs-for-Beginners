/*
 * Introduction to StringBuilder
 */
import java.util.Scanner;
public class stringBuilderExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = sc.nextLine();
		
		
		StringBuilder sb = new StringBuilder(input); // Declare the string builder class and pass string as input
		System.out.println(sb.charAt(4));
		sc.close();
	}

}
