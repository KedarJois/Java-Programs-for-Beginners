/*
 * Set the 2nd bit ( means position = 1 )
 * for a given number n = 5 ( Binary = 0101
 */
public class BitMaskingSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 5;
			int pos = 1;
			int bitMask = 1 << pos;
			
			int newNumber = bitMask | n ;
			
			System.out.println(newNumber); // output will be 7 , by modifying just one bit we were able to set a new value
	}

}
