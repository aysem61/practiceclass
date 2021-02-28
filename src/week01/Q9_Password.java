package week01;

import java.util.Scanner;

public class Q9_Password {

	public static void main(String[] args) {
		
		/*Type java code by using if-else statement,
		 * if the password is "JavaLeaner",output will be "The password is true".
		 * Otherwise,output will be "The password is false".
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("password is JavaLeaner");
		
		String password=scan.next();
		
		
		String expected="JavaLeaner";
		
		if(expected.equals(password)) {
			System.out.println("The password is true");
			
		}else {
			System.out.println("The password is false");
		}
		
	scan.close();

	}

}
