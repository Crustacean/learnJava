public class Main{
	
	public static void main(String[] args){
		
		SmartKitchen smartKitchen = new SmartKitchen();
		
		smartKitchen.getBrewMaster().setHasWorkToDo(true);
		smartKitchen.getBrewMaster().brewCoffee();
		
		smartKitchen.getDishWasher().setHasWorkToDo(true);
		smartKitchen.getDishWasher().doDishes();
		
		smartKitchen.getIceBox().setHasWorkToDo(true);
		smartKitchen.getIceBox().orderFood();
		
	}
	
}