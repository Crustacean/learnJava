public class Main {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer(7);
	
		System.out.println("Toner level: " + printer.addToner(90));
		System.out.println("Pages to be printed: " + printer.printPages(5));	
	
	}
	
}