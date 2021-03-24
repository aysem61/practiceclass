package week07dt;

public class Printer {

	// Create a class and demonstrate proper encapsulation techniques
	// the class will be called Printer
	// It will simulate a real Computer Printer
	// It should have fields for the toner Level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of the
	// paper).
	// Add methods to fill up the toner (up to a maximum of 100%), another method to
	// simulate printing a page (which should increase the number of pages printed).

	private int tonerLevel;
	
	private int numOfPagesPrinted;

	private boolean duplexPrinter;
	
	
	public Printer(int tonerLevel, boolean duplexPrinter) {

		this.tonerLevel = tonerLevel;
		this.duplexPrinter = duplexPrinter;

	}
	
	

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getNumOfPagesPrinted() {
		return numOfPagesPrinted;
	}

	public void setNumOfPagesPrinted(int numOfPagesPrinted) {
		this.numOfPagesPrinted = numOfPagesPrinted;
	}

	

	

	public int add(int tonerAmount) {

		if (tonerAmount >= 0 && tonerAmount <= 100) {

			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}

			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		} else {
			return -1;
		}

	}

	public int printingPages(int pages) {
		int numberOfPages = pages;

		if (this.duplexPrinter) {

			numberOfPages = (pages / 2) + (pages & 2);
		}

		this.numOfPagesPrinted = numberOfPages;
		return numberOfPages;
	}
}
