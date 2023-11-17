public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int pagesPrinted) {
		
		this(10, pagesPrinted, false);
		
	}
	
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		
		this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0 ) ? -1 : tonerLevel ;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
		
	}
	
	public int addToner(int tonerAmount) {
		
		tonerLevel += tonerAmount;
		
		if(tonerLevel > 100 || tonerLevel < 0){
			return -1;
		}
		
		return tonerLevel;
		
	}
	
	public int printPages(int pages) {
		
		int jobPages = 0;
		
		if(duplex){
			System.out.println("This is a duplex printer.");
			jobPages += ((pages/2) + (pages%2));
		}else{
			jobPages += pages;
		}
		
		return jobPages;
		
	}
	
}