import java.util.*;

public class Main {
	
	public static void main(String... args) {
		
		Object[] groceryArray = new Object[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples","PRODUCE", 6);
		groceryArray[2] = "5 oranges";
		System.out.println(Arrays.toString(groceryArray));
		
		ArrayList objectList = new ArrayList();
		objectList.add(new GroceryItem("butter"));
		objectList.add("Yogurt");
		System.out.println(objectList);
		
		
		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("butter"));
		System.out.println(groceryList);
		
	}
	
}

	
record GroceryItem(String name, String type, int count) {
	
	public GroceryItem(String name) {
		
		this(name, "DAIRY", 1);
		
	}
	
	public String toString() {
		
		return String.format("%d %s in %s", count, name.toUpperCase(), type.toLowerCase());
		
	}
	
}