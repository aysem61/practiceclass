package week03;

import java.util.Scanner;

public class PQ_03_Method01 {

	public static void main(String[] args) {
		/*
		 * 
		 * * Write a method named isEven that accepts an integer argument. The method
		 * should return true if the argument is even, or false otherwise.
		 */

		
		System.out.println(even(45));
		
		even1(12);
		
	}
		private static boolean  even1(int a) {
		// TODO Auto-generated method stub
			
   Scanner scan=new Scanner(System.in);
			
			if(a%2==0) {
				return true;
			}else {
				return false;
			}
		
	}
		public static boolean  even(int a) {
			Scanner scan=new Scanner(System.in);
			
			if(a%2==0) {
				return true;
			}else {
				return false;
			}
			
			
			
		}				
					

}
