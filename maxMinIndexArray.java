/*
 * Find the index of maximum and minimum number in an array
 */
import java.util.Scanner;

public class maxMinIndexArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		int maxIndex = 0,minIndex = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > min) { 
				min = array[i];
				maxIndex = i;
			}
			if(array[i] < max) {
				max = array[i];
				minIndex = i;
			}
		}
    sc.close();
		System.out.println("Index of maximum value is :"+maxIndex+""+ "and index minimum value is :"+minIndex);
	}
}
