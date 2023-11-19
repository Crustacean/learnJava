public class MealOrder {
	
	private Burger burger;
	private Item drink;
	private Item side;
	
	public MealOrder() {
		this("regular", "diet coke", "fries");
	}
	
	public MealOrder(String burgerType, String drinkType, String sideType) {
		
		if(burgerType.equalsIgnoreCase("deluxe")) {
			this.burger = new DeluxeBurger(burgerType, 8.5);
		}else {
			this.burger = new Burger(burgerType, 4.0);
		}
		
		this.drink = new Item("drink", "Bamboocha", 0.6);
		this.side = new Item("side", "mango juice", 0.4);
		
	}
	
	public double getTotalPrice() {
		
		if(burger instanceOf DeluxeBurger) {
			return burger.getAdjustedPrice();
		}
		
		return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
	}
	
	public void printItemizedList() {
		
		burger.printItem();
		
		if(burger instanceOf DeluxeBurger) {
			Item.printItem(drink.getName(), 0);
			Item.printItem(side.getName(), 0);
		}else {
			drink.printItem();
			side.printItem();
		}
		
		System.out.println("-".repeat(50));
		Item.printItem("TOTAL PRICE", getTotalPrice());
		
	}
	
	public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5 ) {
		
		if(burger instanceOf DeluxeBurger db) {
			db.addToppings(extra1, extra2, extra3, extra4, extra5);
		}else {
			burger.addToppings(extra1, extra2, extra3);
		}
		
	}
	
	public void setDrinkSize(String size) {
		drink.setSize(size);
	}
	
}