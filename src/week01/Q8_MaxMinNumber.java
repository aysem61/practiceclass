package week01;

import java.util.Scanner;



public class Q8_MaxMinNumber {

	public static void main(String[] args) {

		// Ask user to enter 3 numbers then
		// 1)find the max number
		// 2)find the minimum number
		// EXAMPLE:

		// INPUT:Num1=23
		// num2=29
		// num3=55

		// OUTPUT:
		// Max Number=55
		// MIn Number=23

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter numbers");
		int x = scan.nextInt();

		System.out.println("Please enter numbers");
		int y = scan.nextInt();

		System.out.println("Please enter numbers");
		int z = scan.nextInt();

		if (x > y && x > z) {
			System.out.println("Max number is : " + x);
		} else if (y > z) {
			System.out.println("Max number is : " + y);
		} else {
			System.out.println("Max number is : " + z);
			
		if(x<y && x<z) {
			System.out.println("Min number is : " + x);
		}else if(y<x && y<z) {
			System.out.println("Min number is : " + y);
		}else {
			System.out.println("Min number is : " + z);
		}

		}
	}

}
