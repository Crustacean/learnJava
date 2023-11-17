public class Main {
	
	Printer printer = new Printer(30, 5, false);
	
	System.out.println("Toner level: " + printer.addToner(20));
	System.out.println("Pages to be printed: " + printPages(5));	
	
}