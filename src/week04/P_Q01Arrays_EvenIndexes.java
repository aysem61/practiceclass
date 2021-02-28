package week04;

import java.util.Arrays;

public class P_Q01Arrays_EvenIndexes {

	public static void main(String[] args) {

		// Create a String array whose elements are : Ali, John, ALI, Brad, Mary, Ayse
		// print the elements whose indexes are even on the console

		String arr[] = { "Ali", "John,", " ALI", " Brad", "Mary", " Ayse" };

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				System.out.println(arr[i]);
			}

		}
	}

}
