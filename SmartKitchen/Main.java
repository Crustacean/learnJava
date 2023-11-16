public class Main{
	
	public static void main(String[] args){
		
		SmartKitchen smartKitchen = new SmartKitchen();
		
		smartKitchen.getBrewMaster().brewCoffee();
		smartKitchen.getDishWasher().doDishes();
		smartKitchen.getIceBox().orderFood();
		
	}
	
}