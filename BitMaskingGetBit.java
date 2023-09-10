/*
 * Check if the bit in particular(3rd) position is zero or one
 * Given number n = 5 ; its binary is 0101
 * So in third position we have 0 , lets check that now
 * Observe here that position is from right , means 0th pos is 1 , 1st pos is 0, 2nd is 1 and 3rd is 0
 */
public class BitMaskingGetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 5; //0101
			int pos = 3;
			int bitMask = 1 << pos; // we're doing left shift here
			
			if((bitMask & n) == 0) {
				System.out.println("Bit was zero");
			}else {
				System.out.println("Bit was one");
			}
	}

}
