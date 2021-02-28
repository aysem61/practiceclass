package week01;

import java.util.Scanner;

public class Q12_Gender {

	public static void main(String[] args) {
		
		/*Type a program that ask user their age and gender.
		 * if age is greater than 35 and if gender is male then print man,
		 * if age is greater than 35 and if gender is female then print woman,
		 * if age is less than 35 and if gender is male then print boy,
		 * if age is less than 35 and if gender is female then print girl,
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter is your age");
		int age=scan.nextInt();
		
		System.out.println("Enter is your gender");
		char gender=scan.next().charAt(0);
		
		if(age>=35 ) {
			if(gender=='M') {
				System.out.println(" man");
		}else {
			System.out.println("woman");
		}
		}else {	
				if(gender=='M') {
						System.out.println("boy");
				}else {
						System.out.println("girl");
		}
		
		scan.close();	
		
		}	
	}

}
