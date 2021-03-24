package week05;

import java.util.ArrayList;
import java.util.List;

public class Q01_List01 {

	public static void main(String[] args) {
	
		/*
		 Create an integer list which has 5 elements
		 Update all elements by adding "*" on the right of every element
		 */
		
		List<Integer> yeni=new ArrayList<>();
		
		for(int i=0; i<9; i+=2 ) {
			yeni.add(i+2);
		}
		
		System.out.println(yeni);
		
		List<String> list2=new ArrayList<>();
		
		
		for(int i=0; i<yeni.size(); i++) {
			
			list2.add(yeni.get(i)+"*");
			
			
		   
		}
		
		System.out.println(list2);
	}

}
