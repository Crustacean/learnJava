impor java.util.*;

public class GroceryList {
	
	public static void shutdown(int zero) {
		System.out.println("Exiting application.");		
	}
	
	public static List<T> items(int one) {
		
		Scanner scanner = new Scanner(System.in);s
		
		System.out.println("Enter list of items separated by commas. Press 'Return/Enter' to exit." );
		
		String input = scanner.nextLine();
		
		String[] items = input.split(",").trim();
		
		List<String> list = List.of(items);
		
		return list;
		
	}
	
}