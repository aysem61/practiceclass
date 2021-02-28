package week01;

import java.util.Scanner;

public class Q13_Overflow {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute and print sum of two given numbers(more than
		 * or equal to zero). If given integers or the sum have more than 10
		 * digits,print "overflow". EXAMPLE: INPUT:tWO INTEGERS:25 46 OUTPUT:Sum of the
		 * said two numbers:71
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number1");
		int num1 = scan.nextInt();

		System.out.println("Please enter number2");
		int num2 = scan.nextInt();
		int max = Integer.MAX_VALUE;

		System.out.println(max+" integer in degeri ");

		if( num1>=max || num2>=max  || (num1+num2)>=max) {
			
			System.out.println("overflow ");
			
		}else {
			
			System.out.println(" sonuc : "+ (num1+num2)+" so ");
		}

	}

}
