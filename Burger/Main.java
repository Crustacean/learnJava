public class Main {
	
	public static void main(String[] args) {
		
		/*Item coke = new Item("drink", "coke", 1.50);
		coke.printItem();
		coke.setSize("LARGE");
		coke.printItem();
		
		Item salad = new Item("side", "chicken salad", 11.90);
		salad.setSize("LARGE");
		salad.printItem();
		
		Burger burger = new Burger("regular", 4.00);
		burger.addToppings("bacon", "cheese", "mayo");
		burger.printItem(); */
		
		MealOrder regularMeal = new MealOrder();		
		regularMeal.addBurgerToppings("bacon", "pineapple", "Tomato sauce");
		regularMeal.setDrinkSize("large");
		regularMeal.printItemizedList();
		
		MealOrder secondMeal = new MealOrder("CHICKEN", "SPRITE", "KACHUMBARI");
		secondMeal.addBurgerToppings("Mushroom", "CHEESE", "MAYO");
		secondMeal.setDrinkSize("SMALL");
		secondMeal.printItemizedList();
		
		
	}
	
}