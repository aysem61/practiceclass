package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_List02 {

	public static void main(String[] args) {
		 /*
	     * Create an integer array with 5 elements
	     * Convert to a list
	     * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
	     * Increase the value of every element by 3
	     * Print the multiplication of the elements from index 2 to index 5
	     */
		
		Integer arr []= {3,6,7,8,9};
		
		//Arrays.asList(arr);
	
		//List<Integer>  list=Arrays.asList(arr); bu hata verir onun yerine loop ile 
		
		List<Integer> list=new ArrayList<>();
		
		
		for (int i=0; i<arr.length; i++) {
			
			list.add(arr[i]);
			
		}
		
	
		System.out.println(list);
		
		list.add(0,11); // ilk indexe  11 eklendi 
		
		list.add(3,13); // 3 cu index 13 
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) { // for ile mevcut degerleri update ettik set metho ile 
			
			list.set(i, list.get(i)+3);
		}

		System.out.println(list+ " update  durum");
		
		double count=1;
		
		
		for(int i=2; i<6; i++) {
			
			count=count*list.get(i);
		}
		
		System.out.println(count+ " carpimi ");
	}

}
