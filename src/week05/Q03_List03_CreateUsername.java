package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q03_List03_CreateUsername {

	public static void main(String[] args) {
		/*
	     Type a program that can create random username
	     *  1. Step : Create a database (Create a String list and add five names)
	     *  2. Step : Ask user their name
	     *  3. Step : Remove spaces
	     *  4. Step : Check if username is valid
	     *  5. Step : If username is not in our list user can use that username
	     *  6. Step : If username is in our list add random number at the end of the username 
	 */
		
		List<String> names=new ArrayList<>();
		
		names.add("can");
		names.add("ali");
		names.add("veli");
		names.add("john");
		names.add("betul");
		System.out.println(names);
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Please enter your name ");
		
		String userName=s.nextLine().replace(" ", "");
		
		
		boolean isValid=names.contains(userName); // valid true 
		
		
		Random random=new Random();
		
		int r=random.nextInt(1000);
		
		
		if(isValid) {
			
			userName+=r;
			System.out.print("Bu isim sistem de var size onerimiz su ...");
			
			System.out.println(userName); // alternatif isim onerisi
			
			//names.add(userName+r);
		}else {
			
			//names.add(userName);
			System.out.println(userName);
		}
		
		System.out.println(names);
	}

}
