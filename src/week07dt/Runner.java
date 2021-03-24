package week07dt;

public class Runner {

	public static void main(String[] args) {
		
		Printer pr=new Printer(30,true);
		
		System.out.println("The toner amount is : "+pr.add(23));
		
		pr.printingPages(9);
		System.out.println("The number of paper that you need to use :"+pr.getNumOfPagesPrinted());
		
		
		
		Circle r=new Circle(12.0);
		
		
		System.out.println(r.getArea());
		
		
	}

}
