/*
 * Clear the 3rd bit ( means position = 2 ) in a 
 * given number n = 5 (Binary = 0101)
 */
public class BitMaskingClearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //0101 
		int pos = 2;
		int bitMask = 1 << pos;
		int notBitMask = ~(bitMask); // Performing NOT operation
		
		int newNumber = notBitMask & n;
		System.out.println(newNumber);
	}

}
