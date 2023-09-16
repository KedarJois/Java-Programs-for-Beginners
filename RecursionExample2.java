/*
 *  sum of numbers between a range , when first number is last number is larger than first 
 */
public class RecursionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int result = sum(10,14);
			System.out.println(result);
	}

	private static int sum(int start, int end) {
		// TODO Auto-generated method stub
		if(end > start) {
			return end + sum(start,end-1);
		}else {
			return end;
		}
		
	}

}
