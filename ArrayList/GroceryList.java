import java.util.*;

public class GroceryList {
	
	public static void shutdown() {
		System.out.println("Exiting application.");	
		System.exit(0);
	}
	
	public static void addItems(ArrayList<String> groceries) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter list of items separated by commas. Press 'Return/Enter' to exit." );
		
		String input = scanner.nextLine();
		
		String[] items = input.split(",");
		
		for(int i=0; i<items.length; i++) {
			if(!groceries.contains(items[i].trim())) {
				groceries.add(items[i].trim());
			}
		}
		
		System.out.println(groceries);
		
	}
	
	public static void removeItems(ArrayList<String> groceries) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter list of items separated by commas. Press 'Return/Enter' to exit." );
		
		String input = scanner.nextLine();
		
		String[] items = input.split(",");
		
		for(int i=0; i<items.length; i++) {
			groceries.remove(items[i].trim());
		}
		
		System.out.println(groceries);
		
	}
	
}