package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q02_Arrays_Priint {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 5 names then assign them to an array eg: String names =
		 * "john Marry william Brian Richard";
		 * 
		 *  Then print the names and the number of
		 * the letters in each word 1 by 1 on the console
		 */

		Scanner s=new Scanner(System.in);
		
		
		String kelime="john Marry william Brian Richard";
		
		String arr[]=kelime.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		int co=0;
		
		for(int i=0; i<arr.length; i++) {
			
			
				co=arr[i].length();
				
				System.out.println(arr[i]+" "+co);
				
			
			
		}
	}

}
