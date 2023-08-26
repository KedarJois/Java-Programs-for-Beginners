/*
 * Problem ---> Find the index of a given number 
 * Concept ---> Linear Search Algorithm
 */

import java.util.Scanner;

public class linearSearchinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int[] m = new int[size];
		System.out.println("Enter the " + ""+ size + " " + "elements for this array");
		for (int i = 0; i < size; i++) {
			m[i] = sc.nextInt();
		}

		System.out.println("Enter the number whose index you wanna know :");
		int givenNumber = sc.nextInt();

		indexFinder(givenNumber, m);

		sc.close();
	}

	private static void indexFinder(int givenNumber, int[] m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < m.length; i++) {
			if (m[i] == givenNumber) {
				System.out.println("Index of choosen number is " + i);
			}
		}
	}
}
