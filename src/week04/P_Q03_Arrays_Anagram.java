package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q03_Arrays_Anagram {

	public static void main(String[] args) {
		/*
		 * * Anagram is to create a new word from other word's letters. Write java code
		 * to check if two words are anagram or not isAnagram("listen", "Silent") ==>
		 * anagram
		 * 
		 */

		System.out.println(isAnagram("listen", "Silent"));
	}

	private static String isAnagram(String string, String string2) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String bi = s.nextLine();

		String iki = s.nextLine();

		String h1[] = bi.split("");

		String h2[] = iki.split("");

		Arrays.sort(h1);

		Arrays.sort(h2);

		//System.out.println(Arrays.equals(h1, h2));
		if(Arrays.equals(h1, h2)) {
			return "anagram";
		}else {
			return "is not anagram" ;
		}

	}

}
