import java.util.*;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<String> groceries = new ArrayList<>();
		
		boolean flag = true;
		
		while(flag) {
			options();
			switch(Integer.parseInt(scanner.nextLine())) {
				case 0 -> GroceryList.shutdown();
				case 1 -> GroceryList.addItems(groceries);
				case 2 -> GroceryList.removeItems(groceries);
				default -> flag = false;
			}
		}
		
	}
	
	private static void options() {
		String textBlock = """
				Available Actions:
				
				0 - to Shutdown
				1 - to Add items
				2 - to Remove items """;
		System.out.println(textBlock);
	}
	
}