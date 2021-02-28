package week03;

import java.util.Scanner;

public class PQ04_Loops_RepeatedLetters {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {

		
		
		
		reapetedLoop();

	}

	private static void reapetedLoop() {
		/*
		 * Ask user to enter a name and a character, 
		 * then check how many times the character is repeated 
		 * in the name using loops in the name Example: INPUT
		 * :char ch1= 'a' ; String name =“John came late" OUTPUT : 2
		 */
		
        System.out.println(" please entere a word ");
		
		String word=s.nextLine();
		
		System.out.println(" please enter a char ");
		
		char dene=s.next().charAt(0);
		
		
		
		int count=0;
		
		for(int i=0; i<word.length(); i++) {
			
			if(word.charAt(i)==dene ) {
				count++;
			}
			
		}
		
		System.out.println(count+" tane harf var dir ");

	}

}
