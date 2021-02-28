package week04;

public class P_Q05BreakContinue {

	public static void main(String[] args) {
		
	
	    int arr[] = {2, 5, 6, 7, 9, 12};
	    
	    //print the first three elements of array;
		
		for(int i=0; i<arr.length; i++) {
			if(i>2) {
				break;//to break loop
			}
			System.out.println(arr[i] + "");
		}
		
		//Print just last two elements
		
		for(int i=0; i<arr.length; i++) {
			
			if(i<arr.length-2) {
				
				continue;//to skip loop
			}
			System.out.println(arr[i] + "");
		}
		
		System.out.println();
		//Print the elemets from index 2 to index 4
		
		for(int i=0; i<arr.length; i++) {
			if(i<2) {
				continue;
			}
			if(i>4) {
				break;
			}
			System.out.println(arr[i] + "");
		}
		
		
		
}

}