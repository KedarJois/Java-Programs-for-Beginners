/*
 * Set or modify a character at any index in a string
 */
import java.util.Scanner;
public class stringBuilderSetCharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		sb.setCharAt(2, 'Q');
		System.out.println(sb);
		sc.close();
	}

}
