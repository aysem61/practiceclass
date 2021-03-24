package week05;

import java.util.Scanner;

public class Q06_RepeatedLetters {

	public static void main(String[] args) {
		
		 //Count the number of characters in a String
        //Test the code by using abaab, abaabc, abc
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a String ");
		
		String s=scan.nextLine();
		
		String ch []=s.split("");
		
		System.out.println(ch.length);

	

	}

}
