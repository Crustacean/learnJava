public class Main {
	
	public static void main(String[] args) {
		
		Item coke = new Item("drink", "coke", 1.50);
		coke.printItem();
		coke.setSize("LARGE");
		coke.printItem();
		
		Item salad = new Item("side", "chicken salad", 11.90);
		salad.setSize("LARGE");
		salad.printItem();
		
	}
	
}