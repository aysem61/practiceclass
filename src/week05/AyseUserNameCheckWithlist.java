package week05;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AyseUserNameCheckWithlist {

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
		
		List<String>list=new ArrayList<>();
		
		list.add("ayse");
		list.add("betul");
		list.add("yusuf");
		list.add("can");
		list.add("ali");
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a name");
		
		
		String name=scan.nextLine().replace(" ", "");
		
		Random random=new Random();
		
		int r=random.nextInt();
		
		if(list.contains(name)) {
			
			name=name+r;
			
			//name+=r;
			System.out.println(name+"  bu isim sizin icin alternatif ");
		}else {
			System.out.println(name+"  bu isim kullanilabilir");
		}
		
		
		
		
		
	}
	

}
