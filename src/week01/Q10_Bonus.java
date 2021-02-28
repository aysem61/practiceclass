package week01;

import java.util.Scanner;

public class Q10_Bonus {

	public static void main(String[] args) {
		
		/*A company decided to give bonus of 5% to employee if his/her year of
		 * service is more than 5 years.
		 * Ask user for their salary and year of service and print the net bonus amount.
		 * EXAMPLE:
		 * INPUT : 4 year service
		 * 			Salary:4000
		 * 
		 * OUTPUT:0
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your current salary?");
		int salary=scan.nextInt();
		
		System.out.println("How long have you been working?");
		int year=scan.nextInt();
		
		if(year>5) {
			System.out.println("Your bonus is : " + salary *20/100 + "$");

		}else {
			System.out.println("You need to work "  + (6-year) + "more years to get bonus");
		}
		scan.close();
	}
}
