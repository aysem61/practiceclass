package week01;

import java.util.Scanner;

public class Q7_AbsoluteValue {

	public static void main(String[] args) {
		
		/*Type java code by using if-else statement,
		 * Write a program to print absolute value of a number entered by user.  |x|=x veya |-x|=x
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer to find its absolute value");
		int x=scan.nextInt();
		
		if(x>=0) {
			System.out.println(x);
		}else {
			System.out.println(-1*x);
		}
			scan.close();
	}

}
