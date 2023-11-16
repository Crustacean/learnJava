public class Main{
	
	public static void main(String[] args){
		
		SmartKitchen kitchen = new SmartKitchen();
		
		kitchen.getIceBox().setHasWorkToDo(true);		
		kitchen.getDishWasher().setHasWorkToDo(true);
		kitchen.getBrewMaster().setHasWorkToDo(true);
		
		kitchen.getIceBox().orderFood();
		kitchen.getDishWasher().doDishes();
		kitchen.getBrewMaster().brewCoffee();
		
	}
	
}