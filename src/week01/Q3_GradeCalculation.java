package week01;

import java.util.Scanner;

public class Q3_GradeCalculation {

	public static void main(String[] args) {
		
		/*Ask user to enter mid-term grade,final grade and project grade
		 * Calculate the general grade(mid-term:30%, project:20%, final:50%
		 * 
		 * Example:
		 * INPUT:mid-term grade=78
		 *		 final grade=66
		 *		 project grade=90
		 * OUTPUT:"Your grade is :81,6"
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your mid gerade");
		double mid=scan.nextDouble();
		
		System.out.println("Please eneter your project gerade");
		double project=scan.nextDouble();
		
		System.out.println("Please enter your fin gerade");
		double fin=scan.nextDouble();
		
		double grade=mid*0.3 +project*0.2+fin*0.5;
		
		System.out.println("Your general gerade is :" + grade);
		
	}
	
}
