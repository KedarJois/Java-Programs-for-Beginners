/*
 * This is very useful concept , pre increment and post increment / decrement
 * It looks same but its not , trust me I've come to know while working on project to write a certain function
 * Lets give it a shot now
 */
public class preAndPostIncrements {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		preIncrement(a,b);
		postIncrement(a,b);
	}
	private static void postIncrement(int a, int b) {
		// In post increment , first the value will be assigned and then the value is increased
		// Means first b is assigned 10 , then a will be increased by 1
		b = a++;
		System.out.println("postIncremented Output");
		System.out.println(a); // a = 11
		System.out.println(b); // b = 10 
	}

	private static void preIncrement(int a, int b) {
		// TODO Auto-generated method stub
		b = ++a; // First value will be increased , then assigned
		System.out.println("preIncremented Output");
		System.out.println(a); // 11
		System.out.println(b); // 11
	}
	
}
