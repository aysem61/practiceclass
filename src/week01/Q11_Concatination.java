package week01;

import java.util.Scanner;

public class Q11_Concatination {

	public static void main(String[] args) {
		
		
		
		/*Write a Java program to create s String in the form Str1+Str2+Str1 from to strings.
		 * 
		 * EXAMPLE:
		 * INPUT:Str1=Refrigerator
		 * 		Str2=Empty
		 * 
		 * OUTPUT:EmptyRefrigerator	
		 */

			Scanner scan=new Scanner(System.in);
			
			String str1="Refrigerator";
			
			String str2="Empty";
			
			String sum=str1+str2;
			
			System.out.println(str2+str1);
			
			System.out.println(2+1+2+"Java");//5Java
			
			System.out.println("Java" + 2+2+1);//Java221
			
			System.out.println(2+2 + "Java " +2+3);//4Java 23
			
			String name="Java" ,marks="1";
			String section="A";
			marks+="230";
			
			System.out.println("Name :" + name);
			
			System.out.println("Section:" + section);
			
			System.out.println("Marks :" + marks);//1230
	}


	}


