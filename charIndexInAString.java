/*
 * Find the character index of a given letter in a string
 */
import java.util.Scanner;

public class charIndexInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = sc.nextLine();
		System.out.println("Enter the character whose index you want to know");
		char character = sc.next().charAt(0);
		
		
			char[] array = inputString.toCharArray();
		
				for(int i = 0 ; i <array.length ; i++) {
					char ch = array[i];
					if(ch == character) {
						System.out.println("Index of entered character is  :"+i);
					}
		}
		sc.close();
	}

}
