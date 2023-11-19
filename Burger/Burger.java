public class Burger extends Item {
	
	private Item extra1;
	private Item extra2;
	private Item extra3;
	
	public Burger(String name, double price) {
		super("Burger", name, price);
	}
	
	public String getName() {
		return super.getName() + " BURGER";
	}
	
	public double getAdjustedPrice() {
		
		return getBasePrice() + 
		((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
		((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
		((extra3 == null) ? 0 : extra3.getAdjustedPrice());
		
	}
	
	public double getExtraPrice(String toppingName) {
		
		return switch {
			
			case "Avocado", "Cheese" -> 1.0;
			case "bacon", "ham", "salami" -> 1.5;
			default -> 0.0;
			
		};
		
	}
	
	
	