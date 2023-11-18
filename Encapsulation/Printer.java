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
	
}