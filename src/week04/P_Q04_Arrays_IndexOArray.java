package week04;

import java.util.Scanner;

public class P_Q04_Arrays_IndexOArray {

	public static void main(String[] args) {
		/*
		 * //Create a method to find an element's index in an array
		 * 
		 * Get the element from the user and return index of that element
		 * 
		 * //int my_array[] ={12,15,43,23,56,76,78,90,77,43};
		 * 
		 * //input : 15 ==> output : 15 is in the 1. index //input : 37 ==> output : -1
		 * 
		 */

		Scanner s = new Scanner(System.in);

		System.out.println(" please enter a number ");

		int a = s.nextInt();

		System.out.println(indexOfarray(a));

	}

	private static int indexOfarray(int a) {
		// TODO Auto-generated method stub

		int my_array[] = { 12, 15, 43, 23, 56, 76, 78, 90, 77, 43 };
		
		

		for (int i = 0; i < my_array.length; i++) {

			if (my_array[i] == a) 
				
				return i;
		}

		return -1;
	}

}
