public class Main {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer(7);
	
		System.out.println("Toner level: " + printer.addToner(0));
		System.out.println("Pages to be printed: " + printer.printPages(5));
		System.out.println("Total pages printed: " + getPagesPrinted());
	
	}
	
}