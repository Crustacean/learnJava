public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this(tonerLevel, duplex, 0);
	}
	
	public Printer(int tonerLevel, boolean duplex, int pagesPrinted) {
		
		this.tonerLevel = (tonerLevel > -1 || tonerLevel <=100) ? tonerLevel : -1;
		this.duplex = duplex;
		this.pagesPrinted = pagesPrinted;
	}
	
	public int addToner(int tonerAmount) {
		
		if(tonerAmount < 0 || tonerAmount > 100){
			return -1;
		}
		
		int totalTonerAmount = tonerAmount+tonerLevel;
		
		if(totalTonerAmount > 100) {
			return -1;
		}
		
		tonerLevel  = totalTonerAmount;
		
		return tonerLevel;
		
	}
	
	public int printPages(int pages) {
		
		int pagesToPrint = pages;
		
		if(dublex) {
			
			pagesToPrint = ((pagesToPrint/2) + (pagesToPrint%2));
			
		}
		
		pagesPrinted += pagesToPrint;
		
		return pagesToPrint;
		
	}
	
	public void getPagesPrinted() {
		return pagesPrinted;
	}
	
}