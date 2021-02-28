package week03;

import java.util.Scanner;

public class P_Q01_String_LastThreeChars {

	public static void main(String[] args) {
		/*
		 * Write a Java program to take the last three characters from a given string 
		 * and  add the three characters at both the front and back of the string.
		 * 
		  String length must be greater than three and more.
			INPUT      : Ankara
		    OUTPUT  : araAnkaraara
		 * 
		 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a String please");
//		String str=scan.nextLine();
//		System.out.println(str.substring(str.length()-3)+str+str.substring(str.length()-3));
//		
		System.out.println(treeChar("Ankara"));
		
		
	}

	private static String  treeChar(String s) {
		// TODO Auto-generated method stub
		
		String temp="";
		
		int l=s.length();
		
		temp=s.substring(l-3)+s+s.substring(l-3);
		
		return temp;
	}

}
